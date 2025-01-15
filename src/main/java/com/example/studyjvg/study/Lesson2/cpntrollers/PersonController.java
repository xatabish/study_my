package com.example.studyjvg.study.Lesson2.cpntrollers;

import com.example.studyjvg.study.Lesson2.Exceptions.WrongLoginException;
import com.example.studyjvg.study.Lesson2.Exceptions.WrongPasswordException;
import com.example.studyjvg.study.Lesson2.services.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String hello() {

        return "Добро Пожаловать! ";
    }

    @GetMapping("/login")
    public String login(@RequestParam String login) {
        try {
            return personService.register(login);
        } catch (WrongLoginException e) {
            throw new WrongLoginException("ошибка в логине!");
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException("ошбика в пароле! Либо они не совпадают!");
        }
    }

    @GetMapping("/password")
    public String password(@RequestParam String password, @RequestParam String confirmPassword) {
        try {
            return personService.password(password , confirmPassword);
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException("ошбика в пароле! Либо они не совпадают!");
        }

    }


}
