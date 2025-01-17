package com.example.gateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

  @GetMapping("/gfg")
  public ResponseEntity<Void> getAnonymous() {
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping("/gfge")
  public void getAnonymous2() {
    System.out.println("oke");
  }

}
