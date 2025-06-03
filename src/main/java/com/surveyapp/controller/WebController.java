package com.surveyapp.controller;

import com.surveyapp.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    
    @Autowired
    private SurveyService surveyService;
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/results")
    public String results(Model model) {
        model.addAttribute("stats", surveyService.getSurveyStats());
        return "results";
    }
	
}