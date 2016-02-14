package com.jcart.dev.admin.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


// The implementation of the method body relies on a view technology, in this case Thymeleaf, 
//to perform server-side rendering of the HTML

// HTTP requests are handled by a controller. 
// These components are easily identified by the @Controller annotation. 

@Controller
public class HomeController extends JCartAdminBaseController
{	
	@Override
	protected String getHeaderTitle() {
		return "Home";
	}
	
	// @RequestMapping annotation allows you to map HTTP requests to specific controller methods.
	// By default, @RequestMapping maps all HTTP operations, such as GET, POST
	// method=RequestMethod.GET or method=RequestMethod.POST can also be used to trigger different methods 
	// based on request type is GET or POST
	@RequestMapping("/home")
	public String home(Model model)
	{
		return "home";
	}
}
