package com.moviecriteria.services.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping
public class HomeController {

  @GetMapping(path = "/")
  public String hello(Principal principal) {
    return "<h1>Welcome to the Guest page, " + getPrincipalName(principal) + "<h1> ";
  }

  @GetMapping(path = "/admin")
  public String helloAdmin(Principal principal) {
    return "<h1>Welcome to the Admin page, " + getPrincipalName(principal) + " <h1> ";
  }

  @GetMapping(path = "/user")
  public String helloUser(Principal principal) {
    return "<h1>Welcome to the User page, " + getPrincipalName(principal) + " <h1> ";
  }

  private String getPrincipalName(Principal principal) {
    String username;

    if (principal != null) {
      username = principal.getName();
    } else {
      username = "guest";
    }

    return username;
  }
}