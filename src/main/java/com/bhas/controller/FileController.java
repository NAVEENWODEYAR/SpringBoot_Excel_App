package com.bhas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController 
{

	@GetMapping
	@ResponseStatus(code = HttpStatus.BAD_GATEWAY)
	public String greetMsg()
	{
		return "Welcome to the Excel_File Application,";
	}
}
