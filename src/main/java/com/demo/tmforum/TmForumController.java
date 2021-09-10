package com.demo.tmforum;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TmForumController {
	
@GetMapping("/home")
public ResponseEntity<Object> display()
{
	
	String msg= "Welcome to TM Forum world";	
	return new ResponseEntity<>(msg,HttpStatus.OK);
}
	
}
