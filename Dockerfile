FROM maven:3.8.5-openjdk-17 AS build

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim

COPY --from=build /target/Tienda-1.jar Tienda.jar

EXPOSE 80

ENTRYPOINT ["java","-jar","Tienda.jar"]
