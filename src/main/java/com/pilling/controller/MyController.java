package com.pilling.controller;

import com.pilling.entity.Pills;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String mainPage(){
        return "mainPageView";
    }

    @RequestMapping("/addPills")
    public String addPillsPage(Model model){
        model.addAttribute("pills", new Pills());
        return "addPillsPageView";
    }

    @RequestMapping("/searchPills")
    public String searchPillsPage(){
        return "searchPillsPageView";
    }

    @RequestMapping("/showResult")
    public String showResultPageView(){
        return "showResultPageView";
    }
}
