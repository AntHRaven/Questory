package com.example.questory.controller;

import com.example.questory.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String main(){
        MainService mainService = new MainService();

        return mainService.getData();
    }
}
