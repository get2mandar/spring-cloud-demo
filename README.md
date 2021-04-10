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
All Services (except the config-server) have 2 spring profiles as 'dev' and 'prod'. Upon selection in app-runners the whole application runs in the specific profile as  environment.

### Infrastructure Services   
 - config-server - Spring Cloud Config Server with native configuration
 - eureka-server - Spring Cloud Eureka Discovery Server


### API Services