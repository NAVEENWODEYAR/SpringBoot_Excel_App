package com.bhas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class FileController 
{

	@GetMapping
	@ResponseStatus(code = HttpStatus.BAD_GATEWAY)
	public String greetMsg()
	{
		log.info("LOGGER OBJECT");
		return "Welcome to the Excel_File Application,";
	}
}
