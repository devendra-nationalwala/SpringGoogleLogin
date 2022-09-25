package com.devendranationalwala.oauth2.SpringGoogleLogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller file for rest end points
 * @author Devendra Nationalwala
 */
@RestController
public class IndexController {
	
	/**
	 * Root end point, can be accessed without authentication
	 * @return Welcome Message
	 */
	@GetMapping("/")
	public String welcome(){
		return "Hello Spring";
	}
	
	/**
	 * Restricted end point, accessible after login 
	 * @return authenticated message
	 */
	@GetMapping("/restricted")
	public String retricted() {
		return "To view this page, you need to login!";
	}

}
