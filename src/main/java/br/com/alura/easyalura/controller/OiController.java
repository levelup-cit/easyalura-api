package br.com.alura.easyalura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OiController {

  @GetMapping("/oi")
  public String oi() {
    return "Oi, Spring Boot!";
  }

}
