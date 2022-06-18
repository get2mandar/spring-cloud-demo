# spring-cloud-demo
Spring Cloud Demo App


## Tech Stack
Find the details of Technology Stack used to develop the Applications in this Demo.

[TECH-STACK-README](docs/TECH-STACK-README.md)


## Project Settings
Common Group ID for All Applications in Spring Cloud Demo

 - **Group ID** - blog.panditmandar.scdemo

The Artifact and Port details for all the Applications are listed in their specific README files ( _as mentioned below_ ).


## Services
All Services (except the config-server) have 2 spring profiles as ```dev``` and ```prod```.

Upon selection in **_app-runners_** the whole application runs in the specific profile as  environment.


### Infrastructure Services
To know more details about the Infrastructure Services, check below the ```APPS-INFRA-README```.

[APPS-INFRA-README](apps-infra/APPS-INFRA-README.md)


### API Services
To know more details about the API Services Applications, check below the ```APPS-API-README```.

[APPS-API-README](apps-api/APPS-API-README.md)



## Execute Demo
To execute the Demo Application, first use the APP-RUNNERS to compile or run the Applications, and then make use of the Postman files to check APIs.

> with APP-RUNNERS
Read more details on how to compile and run the various services in this Demo from ```APPS-RUN-README```.

[APPS-RUN-README](app-runners/APPS-RUN-README.md)


> with Postman Client
Use the files from ```postman-files``` to run the APIs using a Postman API Testing Tool.
