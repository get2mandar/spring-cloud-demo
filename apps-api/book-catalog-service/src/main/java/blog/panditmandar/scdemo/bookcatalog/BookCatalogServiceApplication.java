package blog.panditmandar.scdemo.bookcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//@RibbonClients(value = { @RibbonClient(name = "book-data-service"), @RibbonClient(name = "book-added-info-service"), })
@LoadBalancerClients(value = { @LoadBalancerClient(value = "book-data-service"),
		@LoadBalancerClient(value = "book-added-info-service") })
public class BookCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCatalogServiceApplication.class, args);
	}

}
