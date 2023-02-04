FROM openjdk:17
EXPOSE 8085
ADD ./target/proyectoFinal-0.0.1-SNAPSHOT.jar proyectofinal.jar
ENTRYPOINT ["java","-jar","/proyectofinal.jar"]