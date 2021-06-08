/**
 * 
 */
package com.iiht.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DELL
 *
 */

@RestController
public class FirstController {
	
	@GetMapping("/hello")
	public String greet() {
		return "Welcome to the IIHT Spring Boot Training Oberoi !!";
	}

}
