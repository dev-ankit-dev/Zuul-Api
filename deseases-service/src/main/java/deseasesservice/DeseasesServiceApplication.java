package deseasesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Tiwari
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DeseasesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeseasesServiceApplication.class, args);
		
		System.out.println("DeseasesServiceApplication");
	}

}
