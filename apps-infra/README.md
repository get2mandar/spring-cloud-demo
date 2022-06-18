# spring-cloud-demo
Spring Cloud Demo App

Go Back to [DEMO-README](../README.md)

## Infrastructure Services
The Services or Applications available in ```apps-infra``` folder are Infrastructure Services.
Majorly all Applications are for Various Features in Non-Functional Areas that are provided by Spring Cloud Ecosystem.

 - **config-server** - Spring Cloud Config Server with native configuration
 - **eureka-server** - Spring Cloud Eureka Discovery Server
 - **edge-gateway** - Spring Cloud API Gateway Server provides Routing for all the Internal Services


### Git Repository Based Config Store
The Configuration files are stored in the Git Repository in the seperate folder ```configstore```.
It is a git managed and externalized from Config Server as well as externalized for other Applicaitons too.
This gives flexibility to update the configuration in the background and refresh without restart of any API.


### Project Settings and Ports - Infrastructure Applicaitons
Below is the Table for details about Project Settings and Ports:

 - **Infrastructure Applications**

| **Artifact ID** | **Spring App Name** | **Root Package** | **Dev Port** | **Live Port** |
| ---------- | ---------- | ---------- | ---------- | ---------- |
| config-server | config-server | blog.panditmandar.scdemo.infra.configserver | 8888 | 8888 |
| eureka-server | eureka-server | blog.panditmandar.scdemo.infra.eurekaserver | 9761 | 8761 |
| edge-gateway | edge-gateway | blog.panditmandar.scdemo.edge.gateway | 9050 | 8250 |