package com.example.task.controller;

import com.example.task.domain.Account;
import com.example.task.services.impl.AccountServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    private final AccountServiceImpl accountService;

    public MainController(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }


    @GetMapping("/accounts")
    public String account(Model model){
        model.addAttribute("accounts", accountService.findAll());





        return "accounts";
    }
    @GetMapping("/login")
    public String login(Model model){


        return "login";
    }

    @GetMapping("/")
    public String home(Model model){
        return "home";
    }

    /*@DeleteMapping("/sql/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        System.err.println("del");
        Person people = null;
        for (Person p:peoples) {
            if (p.getId() == id) people = p;
        }
        if (people != null) peoples.remove(people);
        return "sql";
        // Delete the user in this method with the id.
    }*/
}
