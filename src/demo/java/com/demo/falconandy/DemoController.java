package com.demo.falconandy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController {
  @RequestMapping("/")
  public String index() {
    return "/";
  }
}
