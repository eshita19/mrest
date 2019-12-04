# Web Service
   - Software component which can be accessed over network using a endpoint. 
   - ## Soap(Simple Object Access Protocol) based web service:
       - https://www.guru99.com/soap-simple-object-access-protocol.html. 
       - For portablity, uses a common format of message communication, xml.
       - WSDL(Web service definition language), consists of xml format of message, SOAP envelope.
       - Each soap envelope consists of
           - Header(authentication details)
           - Body(Name of the webservice, parameters required)
           - Fault element.
   - ## REST(Respresentational State Tranfer):
     - It is an architecture.
     - A RESTful web application exposes information about itself in the form of information about its resources. It also enables the client to take actions on those resources, such as create new resources (i.e. create a new user) or change existing resources.
      - When a RESTful API is called, the server will transfer to the client a representation of the state of the requested resource.
      - Representation- Format of data, State- Requested data.
      - Making a request:
        - **Path to resource(HTTP URI)**
          - Paths should contain the information necessary to locate a resource with the degree of specificity needed.
          - Use Nouns instead of Verbs.
          - Resource path examples:
             - /users <- user’s list
             - /users/123 <- specific user
             - /users/123/orders <- orders list that belongs to a specific user
             - /users/123/orders/0001 <- specific order of a specific user
          - Filtering, sorting, paging, and field selection:
             - GET /users?country=USA
             - GET /users?sort=birthdate_date:asc
             - GET /users?limit=100
             
        - **Operation to perform on resource(CRUD ops specified using HTTP verb)**:
           - DELETE: 
              - Delete an existing resource.
              - DELETE http://www.example.com/customers/12345/orders.
              - Response Code: 200 (OK)
           - GET: 
              - Retrieve a representation of a resource.
              - GET http://www.example.com/customers/12345/orders.
              - Response Code: 200 (OK)
           - HEAD: Identical to a GET except that no message body is returned in the response.
           - POST
              - URI: POST http://www.example.com/customers/12345/orders.
              - Create a new resource.
              - Response Code : 201 (Created)
           - PUT: 
             - Updates or replace a resource.
             - PUT http://www.example.com/customers/12345/orders/98765
             - Always pass the complete payload, that is replace the resource data.
             - Response Code: 200 (OK)
           - PATCH:
             - Updates or modifies a resource.
             - PATCH http://www.example.com/customers/12345/orders/98765
             - You can pass partial data of the resource to be updated.
              - Response Code: 200 (OK)
        - **Response Codes**:
           - https://developer.mozilla.org/en-US/docs/Web/HTTP/Status
           - HTTP response status codes indicate whether a specific HTTP request has been successfully completed. Responses                 are grouped in five classes:
               - Informational responses (100–199)
               - Successful responses (200–299)
               - Redirects (300–399)
               - Client errors (400–499)
               - Server errors (500–599)
        - **Optional Message body containing data**:
           - Accept header : Specifies the type of data sent by server.
           - Content-type header: Specifies the type of data sent to server by client.
           - Example:  “text/plain”, “application/xml”, “text/html”, “application/json”, “image/gif”, and “image/jpeg”
           - **Java XML and JSON binding**:
              - 
        - Optional Query param, Headers.
           
           
