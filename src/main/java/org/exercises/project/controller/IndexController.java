package org.exercises.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(Model model){
        String myName = "Lorenzo Galimberti";
        model.addAttribute("subtitle", myName);

        return "homepage";
    }

    @GetMapping("/movies")
    public String movies(){
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(){
        return "songs";
    }
}
