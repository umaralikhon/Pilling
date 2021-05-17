package com.pilling.controller;

import com.pilling.entity.Pills;
import com.pilling.service.PillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @Autowired
    PillsService pillsService;

    @RequestMapping("/")
    public String mainPage(){
        return "mainPageView";
    }

    @RequestMapping("/addPills")
    public String addPillsPage(Model model){
        Pills pills = new Pills();
        model.addAttribute("pills", pills);
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

    @RequestMapping("/savePills")
    public String savePillsPage(@ModelAttribute("pills") Pills pills){
        pillsService.savePill(pills);

        return "redirect: /addPills";
    }
}
