package com.example.studyjvg.study.Lesson7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public String add (@RequestParam int id) {
        storeService.add(id);
        return "Товар успешно добавлен.";
    }

    @GetMapping()
    public String get () {
        return storeService.get();

    }

}
