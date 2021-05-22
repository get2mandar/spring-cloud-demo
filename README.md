# spring-cloud-demo
Spring Cloud Demo App


## Initial Tech Stack
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
 - **edge-gateway** - Spring Cloud API Gateway Server provides Routing for all the Internal Services


#### Git Repository Based Config Store
The Configuration files are stored in the Git Repository in the seperate folder ```configstore```.
It is a git managed and externalized from Config Server as well as externalized for other Applicaitons too.
This gives flexibility to update the configuration in the background and refresh without restart of any API.


### API Services
The Services or Applications available in ```apps-api``` folder are API Services.
Majorly all Applications are Functional or Data CRUD Operations.

 - **book-data-service** - Spring Boot Book Data Service, a CRUD Operations Microservice for Book, Author and Publisher Primary Data
 - **book-added-info-service** - Spring Boot Book Added Information Service, Stores Additional Details for a Book like Pages, Language, Published Month-Year Image etc.
 - **book-catalog-service ** - Spring Boot Book Catalog Service, for Search Filters and Search By Various Criteria like by Book Name, Publisher, Author, Publisher Month-Year, Books by Author, Books by Publisher etc.
 

### Project Settings and Ports
Common Group ID for All Applications in Spring Cloud Demo

 - **Group ID** - blog.panditmandar.scdemo

Below is the Table for details about Project Settings and Ports:

 - **Infrastructure Applications**

| **Artifact ID** | **Spring App Name** | **Root Package** | **Dev Port** | **Live Port** |
| ---------- | ---------- | ---------- | ---------- | ---------- |
| config-server | config-server | blog.panditmandar.scdemo.infra.configserver | 8888 | 8888 |
| eureka-server | eureka-server | blog.panditmandar.scdemo.infra.eurekaserver | 9761 | 8761 |
| edge-gateway | edge-gateway | blog.panditmandar.scdemo.edge.gateway | 9050 | 8250 |


 - **API Services Applications**
API Services Applications Can have Multiple Instances (max 3) so those Applications have multiple Ports.
 
| **Artifact ID** | **Spring App Name** | **Root Package** | **Dev Port** | **Live Port** |
| ---------- | ---------- | ---------- | ---------- | ---------- |
| book-data-service | book-data-service | blog.panditmandar.scdemo.bookdata | 9081/2/3 | 8281/2/3 |
| book-added-info-service | book-added-info-service | blog.panditmandar.scdemo.bookinfo | 9071/2/3 | 8271/2/3 |
| book-catalog-service | book-catalog-service | blog.panditmandar.scdemo.bookcatalog | 9061/2/3 | 8261/2/3 |


### Execute
Use the executables from the folder ```app-runners``` to compile or run the Applications stack.

Use the files from ```postman-files``` to run the APIs using a Postman API Testing Tool.
