# spring-cloud-demo
Spring Cloud Demo App


## Tech Stack
Find the details of Technology Stack used to develop the Applications in this Demo, with ```README``` file [TECH-STACK-README](docs/README.md).


## Project Settings
Common Group ID for All Applications in Spring Cloud Demo

 - **Group ID** - blog.panditmandar.scdemo

The Artifact and Port details for all the Applications are listed in their specific README files ( _as mentioned below_ ).


## Services
All Services (except the config-server) have 2 spring profiles as ```dev``` and ```prod```.

Upon selection in **_app-runners_** the whole application runs in the specific profile as  environment.


### Infrastructure Services
To know more details about the Infrastructure Services, check the ```README``` file [APPS-INFRA-README](apps-infra/README.md).


### API Services
To know more details about the API Services Applications, check the ```README``` file [APPS-API-README](apps-api/README.md).


### Project Settings and Ports
Below is the Table for details about Project Settings and Ports:

 - **Infrastructure Applications**

| **Artifact ID** | **Spring App Name** | **Root Package** | **Dev Port** | **Live Port** |
| ---------- | ---------- | ---------- | ---------- | ---------- |
| config-server | config-server | blog.panditmandar.scdemo.infra.configserver | 8888 | same as Dev |
| eureka-server | eureka-server | blog.panditmandar.scdemo.infra.eurekaserver | 9761 | 8761 |
| edge-gateway | edge-gateway | blog.panditmandar.scdemo.edge.gateway | 9050 | 8250 |
| admin-dash | admin-dash | blog.panditmandar.scdemo.admindash | 9090 | 8290 |


 - **API Services Applications**
API Services Applications Can have Multiple Instances (max 3) so those Applications have multiple Ports.
 
| **Artifact ID** | **Spring App Name** | **Root Package** | **Dev Port** | **Live Port** |
| ---------- | ---------- | ---------- | ---------- | ---------- |
| book-data-service | book-data-service | blog.panditmandar.scdemo.bookdata | 9081/2/3 | 8281/2/3 |
| book-added-info-service | book-added-info-service | blog.panditmandar.scdemo.bookinfo | 9071/2/3 | 8271/2/3 |
| book-catalog-service | book-catalog-service | blog.panditmandar.scdemo.bookcatalog | 9061/2/3 | 8261/2/3 |


## Execute Demo
To execute the Demo Application, first use the APP-RUNNERS to compile or run the Applications, and then make use of the Postman files to check APIs.

 - With APP-RUNNERS

Read more details on how to compile and run the various services in this Demo with ```README``` file [APPS-RUN-README](app-runners/README.md).


 - With Postman Client

Use the files from ```postman-files``` to run the APIs using a Postman API Testing Tool.
