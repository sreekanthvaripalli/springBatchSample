# Spring Batch Sample

this project is for a simples spring batch processing which can be scalable to bigger batches according to use case.

After cloning the project, just execute below goal

`mvn clean compile`

then run the project using the below command:

`mvn spring-boot:run`

once application come to running state, it will automatically read the CSV file line by line, process it and save it to DB.

we can verify the saved recods by accessing H2 console


Access h2-console at:

    http://localhost:8080/h2-console 

and provide below details to login

    Driver class: org.h2.Driver
    JDBC URL: jdbc:h2:mem:batchDB
    username: sa
    password: just leave it empty