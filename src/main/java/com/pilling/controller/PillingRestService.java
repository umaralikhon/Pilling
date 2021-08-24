package com.pilling.controller;

import com.pilling.entity.Pills;
import com.pilling.service.PillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PillingRestService {
    @Autowired
    private PillsService service;

    @GetMapping("/pills")
    public List<Pills> getAllPills(){
        List<Pills> allPills = service.getAllPills();
        return allPills;
    }

    @PostMapping("/pills")
    public Pills savePills(@RequestBody Pills pills){
       service.savePill(pills);
       return pills;
    }

    @PutMapping("/pills")
    public Pills updatePills(@RequestBody Pills  pills){
        service.savePill(pills);
        return pills;
    }

    @GetMapping("/pills/{id}")
    public Pills getPillById(@PathVariable int id){
        Pills pill = service.getPill(id);
        return pill;
    }

    @GetMapping("/pills/name/{name}")
    public Pills getPillByName(@PathVariable String name){
        Pills pill = service.searchPills(name);
        return pill;
    }

    @DeleteMapping("/pills/{id}")
    public String deletePillById(@PathVariable int id){
        service.deletePill(id);
        return "Pill was deleted!";
    }
}
