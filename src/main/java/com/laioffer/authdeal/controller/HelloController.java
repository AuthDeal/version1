package com.laioffer.authdeal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@CrossOrigin
public class HelloController {
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index() {
    return "index.html?page='a'";
  }
}
