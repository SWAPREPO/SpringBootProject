package com.sst.project.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sst.project.entity.ApiResponse;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@GetMapping("/test-get")
	private ResponseEntity<ApiResponse> testGetMapping() {
		return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse(200,"Success","Get called at " + new Date()));
	}
	
	@GetMapping("/test-get2")
	private ResponseEntity<ApiResponse> testGetMapping2() {
		return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse(200,"Success","Get called at " + new Date()));
	}
	
	@GetMapping("/*")
	private ResponseEntity<ApiResponse> defaultMapping() {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(400,"Failed","URL does not exist"));
	}
}
