package com.certus.demo.controllers;

import com.certus.demo.entidades.Addition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.Binding;

@Controller
public class AdditionController {

    @GetMapping("/index")
    public String ViewForm(Model model){
    model.addAttribute("Addition", new Addition());
    return "index";
    }

    @PostMapping("/resultado")
    public String addForm(@ModelAttribute Addition addition, BindingResult result, Model model){
        model.addAttribute("addition",addition);
        return "resultado";
    }
}
