package com.pilling.controller;

/**
 * @Author Umaralikhon Kayumov
 */

import com.pilling.entity.Basket;
import com.pilling.entity.Pills;
import com.pilling.service.BasketService;
import com.pilling.service.PillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    private PillsService pillsService;

    @Autowired
    BasketService basketService;

    @RequestMapping("/")
    public String mainPage() {
        return "mainPageView";
    }

    @RequestMapping("/addPills")
    public String addPillsPage(Model model) {
        Pills pills = new Pills();
        model.addAttribute("pills", pills);

        return "addPillsPageView";
    }

    @RequestMapping("/savePills")
    public String savePillsPage(@ModelAttribute("pills") Pills pills) {
        pillsService.savePill(pills);
        return "redirect:/addPills";
    }

    @RequestMapping("/updatePill")
    public String updateEmployeePage(@RequestParam("pillId") int id, Model model) {
        Pills pill = pillsService.getPill(id);
        model.addAttribute("pills", pill);

        return "addPillsPageView";
    }

    @RequestMapping("/deletePill")
    public String deletePillPage(@RequestParam("pillId") int id) {
        pillsService.deletePill(id);
        return "redirect: /searchPills";
    }

    List<Pills> basketList = null;

    @RequestMapping("/searchPills")
    public String searchPillsPage(@ModelAttribute("searchPillsAttr") Pills pill, Model model) {
        List<Pills> searchList = new ArrayList<>();
        searchList.addAll(pillsService.searchPills(pill.getName()));
        model.addAttribute("searchResult", searchList);

        if (searchList != null) {
            basketList = new ArrayList<>();
            basketList.addAll(searchList);
        }

        return "searchPillsPageView";
    }

    @RequestMapping("/toBasket")
    public String toBasketPage() {
        Pills tempPill = null;

        if (basketList != null) {
            tempPill = basketList.get(0);
        }

        Basket basket = new Basket();
        basket.setName(tempPill.getName());
        basket.setCost(tempPill.getCost());
        basketService.savePill(basket);

        return "redirect: /searchPills";
    }

    @RequestMapping("/showBasket")
    public String showBasketPage(Model model, HttpServletRequest request) {
        List<Basket> allPillsInTheBasket = basketService.getAllPills();
        int sum = countSum();

        model.addAttribute("allPillsInTheBasket", allPillsInTheBasket);
        request.setAttribute("sum", sum);

        return "showBasketPageView";
    }

    public int countSum() {
        List<Basket> allPillsInTheBasket = basketService.getAllPills();
        int sum = 0;

        for (Basket b : allPillsInTheBasket) {
            sum += b.getCost();
        }

        return sum;
    }

    @RequestMapping("/clearBasket")
    public String clearBasketPage() {
        basketService.truncateTable();
        return "showBasketPageView";
    }
}
