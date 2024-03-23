package com.example.gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/another")
public class DemoController2 {

  @GetMapping("/gfg")
  public ResponseEntity<String> getAnonymous() {
    return ResponseEntity.ok("Welcome to another");
  }

}
