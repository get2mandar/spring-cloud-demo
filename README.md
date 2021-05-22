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
All Services (except the config-server) have 2 spring profiles as ```dev``` and ```prod```. Upon selection in **_app-runners_** the whole application runs in the specific profile as  environment.

### Infrastructure Services
The Services or Applications available in ```apps-infra``` folder are Infrastructure Services.
Majorly all Applications are for Various Features in Non-Functional Areas that are provided by Spring Cloud Ecosystem.

 - **config-server** - Spring Cloud Config Server with native configuration
 - **eureka-server** - Spring Cloud Eureka Discovery Server


#### Local Config Store
The Configuration files are stored locally to the ```config-server``` Application.
It is stored inside the ```src\main\resources\config``` folder.


### API Services
The Services or Applications available in ```apps-api``` folder are API Services.
Majorly all Applications are Functional or Data CRUD Operations.

 - **book-data-service** - Spring Boot Book Data Service, a CRUD Operations Microservice for Book, Author and Publisher Primary Data


### Project Settings and Ports
Common Group ID for All Applications in Spring Cloud Demo

 - **Group ID** - blog.panditmandar.scdemo

Below is the Table for details about Project Settings and Ports:

 - **Infrastructure Applications**

| **Artifact ID** | **Spring App Name** | **Root Package** | **Dev Port** | **Live Port** |
| ---------- | ---------- | ---------- | ---------- | ---------- |
| config-server | config-server | blog.panditmandar.scdemo.infra.configserver | 8888 | 8888 |
| eureka-server | eureka-server | blog.panditmandar.scdemo.infra.eurekaserver | 9761 | 8761 |


 - **API Services Applications**
API Services Applications Can have Multiple Instances (max 3) so those Applications have multiple Ports.
 
| **Artifact ID** | **Spring App Name** | **Root Package** | **Dev Port** | **Live Port** |
| ---------- | ---------- | ---------- | ---------- | ---------- |
| book-data-service | book-data-service | blog.panditmandar.scdemo.bookdata | 9081/2/3 | 8281/2/3 |


### Execute
Use the executables from the folder ```app-runners``` to compile or run the Applications stack.

Use the files from ```postman-files``` to run the APIs using a Postman API Testing Tool.
