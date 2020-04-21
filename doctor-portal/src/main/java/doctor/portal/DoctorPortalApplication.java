package doctor.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Tiwari
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class DoctorPortalApplication {

	public static void main(String[] args) {

		SpringApplication.run(DoctorPortalApplication.class, args);
		
		System.out.println("hello fixes in main method");

	}

}
