package com.example.studyjvg.study.Lesson7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order")
public class StoreController {

    @GetMapping("/add")
    public String add (@RequestParam int id) {

        return "успешно добавленно ";
    }

    @GetMapping()
    public String get () {

        return null ;
    }

}
