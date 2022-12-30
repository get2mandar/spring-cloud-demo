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
The Configuration files are stored in the separate Git Repository ```spring-cloud-demo-configstore```.
It is a git managed and externalized from Config Server as well as externalized for other Applicaitons too.
This gives flexibility to update the configuration in the background and refresh without restart of any API.

<ins>**_Note_**</ins>&nbsp;:- &nbsp;&nbsp;The Git Repository URL and User Credentials to access the Repository are provided at runtime. The required variables can be configured as Environment Variables, so those can be used to pass at runtime as values for ```config-server``` executable Jar.

 - **GH_SCDEMO_URI** - Spring Cloud Config Server Git URI
 - **GH_USER** - Spring Cloud Config Server Git Username
 - **GHP_RONLY_TOKEN** - Spring Cloud Config Server Git Password ( Recommended to use Read-Only token for reading repository, instead of Git Account Password ) 
 - **GH_SCDEMO_BASEDIR** - Spring Cloud Config Server Git Base Directory ( This is required to set as Local Path, a Place-Holder for Config Server to copy Config Files )