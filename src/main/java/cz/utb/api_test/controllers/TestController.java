package cz.utb.api_test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    String test(){
        String msg = "Hello world";
        return msg;
    }

}
