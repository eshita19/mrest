package org.emathur.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.emathur.rest.beans.Student;

@Path("/students")
public class StudentRestProvider {
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/{id}")
	public Response getStudent(@PathParam(value="id") String id){
		Student student = new Student();
		student.setId(id);
		student.setName("name" + id);
		return Response.ok(student).build();
	}
}
