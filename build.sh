docker rm container --force mrest 
docker image rm eshita19/mrest:latest

mvn clean install -DskipTests

docker build -t eshita19/mrest:latest .
docker container run -d --name mrest -p 8080:8080 eshita19/mrest:latest

