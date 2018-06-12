package com.example.demopdfja;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping(path = "hello.pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public String hello(Model model) {
        model.addAttribute("message", "こんにちは!");
        return "hello";
    }
}
