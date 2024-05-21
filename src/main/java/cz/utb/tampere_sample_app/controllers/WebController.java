package cz.utb.tampere_sample_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path = "/")
public class WebController {

    @RequestMapping("/greeting")
    public String greetings(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greetings";
    }

    @RequestMapping("/calculator")
    public String calculator(Model model) {
        return "calculator";
    }
}
