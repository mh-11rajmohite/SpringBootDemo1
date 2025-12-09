package com.springboot.WhatsAppApplication.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/")
public ResponseEntity<String> getHome() {
    return ResponseEntity.ok("Welcome to home page !!!");
}

}
