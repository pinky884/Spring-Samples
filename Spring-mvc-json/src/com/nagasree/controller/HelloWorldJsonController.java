package com.nagasree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nagasree.entity.Person;

@Controller
@RequestMapping("/HelloWorld")
public class HelloWorldJsonController {
	
	@RequestMapping(value="getPerson",method=RequestMethod.GET,headers="Accept=*/*")
	public @ResponseBody Person getPerson(){
		Person p = new Person();
		p.setFirstName("Nagasree");
		p.setLastName("suresh");
		p.setGender("f");
		p.setAge(20);
		return p;
	}
	
	@RequestMapping(value="addPerson",method=RequestMethod.POST)
	public @ResponseBody Person addPerson(@RequestBody final Person person){
		System.out.println("person is " + person);
		return person;
	}

}
