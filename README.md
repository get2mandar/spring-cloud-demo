# spring-cloud-demo
Spring Cloud Demo App


## Tech Stack 
 - JDK 8 - jdk1.8.0_121
 - Apache Maven version 3.6.3
 - Spring Boot version 2.3.0.RELEASE
 - Spring Cloud version Hoxton.SR5
 - IDE: Spring Tool Suit (STS) version 3.9.4.RELEASE
 - OS: Windows


## Services
All Services (except the config-server) have 2 spring profiles as ```dev``` and ```prod```. Upon selection in app-runners the whole application runs in the specific profile as  environment.

### Infrastructure Services
The Services or Applications available in ```apps-infra``` folder are Infrastructure Services.
Majorly all Applications are for Various Features in Non-Functional Areas that are provided by Spring Cloud Ecosystem.

 - config-server - Spring Cloud Config Server with native configuration
 - eureka-server - Spring Cloud Eureka Discovery Server

#### Git Repository Based Config Store
The Configuration files are stored in the Git Repository in the seperate folder ```configstore```.
It is a git managed and externalized from Config Server as well as externalized for other Applicaitons too.
This gives flexibility to update the configuration in the background and refresh without restart of any API.


### API Services
The Services or Applications available in ```apps-api``` folder are API Services.
Majorly all Applications are Functional or Data CRUD Operations.

 - book-data-service - Spring Boot Book Data Service, a CRUD Operations Microservice for Book, Author and Publisher Primary Data
 

### Execute
Use the executables from the folder ```app-runners``` to compile or run the Applications stack.

Use the files from ```postman-files``` to run the APIs using a Postman API Testing Tool.
