package su.meihua.welcome.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to the java World!";
	}
	
	@GetMapping("/{in}")
	public String hello(@PathVariable String in) {
		return "Hi, " + in +"!";
	}
	
}
