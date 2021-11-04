package com.example.demoheroku.controller;

import com.example.demoheroku.dao.AccountDao;
import com.example.demoheroku.entity.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@Controller
public class HomeController {
    @Autowired
    AccountDao ac;
    @GetMapping("/demo")
    public String heroku(Model model){
        List<Account> a = ac.findAll();
      model.addAttribute("mesage",a.get(0).getUsername());
        return "heroku";
    }
}
