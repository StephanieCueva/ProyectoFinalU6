FROM openjdk:17
ADD ./target/proyectoFinal-0.0.1-SNAPSHOT.jar proyectofinal.jar
ENTRYPOINT ["java","-jar","/proyectofinal.jar"]