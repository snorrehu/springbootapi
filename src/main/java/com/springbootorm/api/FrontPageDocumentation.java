package com.springbootorm.api;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
public class FrontPageDocumentation {

    @RequestMapping("/")
    public String homePage() {
      return "test";
    }
}
