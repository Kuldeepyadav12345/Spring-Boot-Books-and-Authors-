package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;

//@RestController
@Controller
public class MyController {
	@RequestMapping("/")
	public String firstpage()
	{
		return "Hello customer" ;
		
	}
	@RequestMapping("/{name}")
	public String first(@PathVariable("name") String str)
	{
		return "Hello customer" +str;
		
	}
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name", required=false, defaultValue="Spring web Mvc") String name,Model model)
	{
		model.addAttribute("customer",name);// JSP request scope model is integrated with the view
		return "customerpage"; //logical name of the view which will be mapped by a viewResolver
	}
	
	
	
	@GetMapping("/loginpage")
	public String loginpage() {
		return "This is Home Page";
	}
	
	@GetMapping("/getCources")
	//get list of course
	public List<Courses> getCourses()
	{
		return null;
		
	}
	
	

}
