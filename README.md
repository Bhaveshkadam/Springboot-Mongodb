# Springboot-Mongodb
This is the java spring boot project integrated with mongodb
![Mongo-Spring]( https://github.com/Bhavesh-SP18/Springboot-Mongodb/blob/main/maxresdefault.jpg)

## Starter data MongoDB (the dependency we added while creating the Spring Initializr project) in pom.xml

#### A property on application.properties file to specify the connection string to a MongoDB cluster Connection to MongoDB Atlas does not require any other code. 

```bash
server.port=8093
spring.data.mongodb.uri=mongodb+srv://MongoDB:root@test.x85prsg.mongodb.net/?retryWrites=true&w=majority
spring.data.mongodb.database=testdb
```

### MongoDB Atlas is a convenient way to store and access data anywhere. Visit the MongoDB Atlas page to get started.

## Build java project

```bash
mvn spring-boot:run
```
## Swagger url

```bash
http://localhost:8093/swagger-ui/
```
