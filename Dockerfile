FROM tomcat:8

RUN apt-get update && apt-get install -y vim

COPY ./target/mrest-0.1.war $CATALINA_HOME/webapps
RUN mv $CATALINA_HOME/webapps/mrest-0.1.war  $CATALINA_HOME/webapps/mrest.war