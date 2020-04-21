package deseasesservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tiwari
 *
 */

@RestController
public class MainController {

	@GetMapping("/diseases")
	public String doctors() {
		
		System.out.println("diseases");

		return "List of diseases";
	}
}