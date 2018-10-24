package com.springbootorm.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FrontPageDocumentation {
    @RequestMapping("/")
    public String one() {
        return "redirect:/static/test.html";
    }
}
