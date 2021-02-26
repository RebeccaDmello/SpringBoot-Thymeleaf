package com.example.RebeccaMosesDmelloMidterm.Controller;

import com.example.RebeccaMosesDmelloMidterm.Entity.Model;
import com.example.RebeccaMosesDmelloMidterm.Service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JokesController {

    @Autowired
    private JokesService jokesService;

    @RequestMapping("/joke")
    public String myController(@ModelAttribute("joke") Model model){
        return  "index";
    }

    @GetMapping("")
    public List<String> getJokes(){
        return jokesService.getJokes();
    }


}
