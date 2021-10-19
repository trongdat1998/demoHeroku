package com.example.demoheroku.controller;

import com.example.demoheroku.dao.AccountDao;
import com.example.demoheroku.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    AccountDao accountDao;
    @ResponseBody
    @RequestMapping("/demoheroku")
    public String heroku(Model model){
        List<Account> ac = accountDao.findAll();
        System.out.println(ac.get(0).getUsername());
        return "demo";
    }
}
