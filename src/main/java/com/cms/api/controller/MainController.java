package com.cms.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MainController {
	@RequestMapping(value="myproject/hello",method=RequestMethod.GET,produces="appplication/json",consumes="application/json")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public String createEmployee(@RequestBody String name){
		return "Hello "+name;
	}

}
