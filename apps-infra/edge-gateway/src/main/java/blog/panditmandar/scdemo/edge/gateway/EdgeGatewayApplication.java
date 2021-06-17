package blog.panditmandar.scdemo.edge.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EdgeGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeGatewayApplication.class, args);
	}

}
