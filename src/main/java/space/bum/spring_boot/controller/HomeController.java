package space.bum.spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
  @GetMapping("/")
  public String showHomePage() {
    return "index";
  }

}
