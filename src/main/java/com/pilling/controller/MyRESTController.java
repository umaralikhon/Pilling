package com.pilling.controller;

import com.pilling.entity.Pills;
import com.pilling.service.PillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private PillsService pillsService;

    @PostMapping("/addPills")
    public Pills addPills(@RequestBody Pills pills){
        pillsService.savePill(pills);
        return pills;
    }

    @GetMapping("/showAllPills")
    public List<Pills> getAllPills(){
        List<Pills> allPills = pillsService.getAllPills();
        return allPills;
    }
}
