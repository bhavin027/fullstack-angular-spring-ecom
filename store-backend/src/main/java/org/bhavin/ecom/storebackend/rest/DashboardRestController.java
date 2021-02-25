package org.bhavin.ecom.storebackend.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/dashboard")
public class DashboardRestController {

	@GetMapping(path="/")
	public String homePage() {
		return "Hello";
	}
	
}
