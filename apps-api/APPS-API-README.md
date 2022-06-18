# spring-cloud-demo
Spring Cloud Demo App


## API Services
The Services or Applications available in ```apps-api``` folder are API Services.
Majorly all Applications are Functional or Data CRUD Operations.

 - **book-data-service** - Spring Boot Book Data Service, a CRUD Operations Microservice for Book, Author and Publisher Primary Data
 - **book-added-info-service** - Spring Boot Book Added Information Service, Stores Additional Details for a Book like Pages, Language, Published Month-Year Image etc.
 - **book-catalog-service ** - Spring Boot Book Catalog Service, for Search Filters and Search By Various Criteria like by Book Name, Publisher, Author, Publisher Month-Year, Books by Author, Books by Publisher etc.
 

### Project Settings and Ports - API Services Applications
Below is the Table for details about Project Settings and Ports:

 - **API Services Applications**
API Services Applications Can have Multiple Instances (max 3) so those Applications have multiple Ports.
 
| **Artifact ID** | **Spring App Name** | **Root Package** | **Dev Port** | **Live Port** |
| ---------- | ---------- | ---------- | ---------- | ---------- |
| book-data-service | book-data-service | blog.panditmandar.scdemo.bookdata | 9081/2/3 | 8281/2/3 |
| book-added-info-service | book-added-info-service | blog.panditmandar.scdemo.bookinfo | 9071/2/3 | 8271/2/3 |
| book-catalog-service | book-catalog-service | blog.panditmandar.scdemo.bookcatalog | 9061/2/3 | 8261/2/3 |