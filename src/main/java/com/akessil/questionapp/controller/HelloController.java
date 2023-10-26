package com.akessil.questionapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="")
public class HelloController {

    @GetMapping("/")
    public @ResponseBody String health() {
        return String.format("OK");
    }

    @GetMapping("/hello")
    public @ResponseBody String hello(@RequestParam(value = "name") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping(value = "/helloWorld")
    public @ResponseBody QuestionDto helloWorld() {
        QuestionDto q = new QuestionDto();
        q.setText("Hello World");
        return q;
    }
}
