package com.example.studyjvg.study.Lesson2.services;

import com.example.studyjvg.study.Lesson2.Exceptions.WrongLoginException;
import com.example.studyjvg.study.Lesson2.Exceptions.WrongPasswordException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {

    public String register(String login) throws WrongLoginException {
        if (login.length() <= 20 && login.matches("^[a-zA-Z0-9._-]{3,20}$")) {
            return "логин успешно добавлен!";
        } else {
            throw new WrongLoginException();
        }
    }

    public String password(String password, String confirmPassword) {
        if (password.length() <= 20 && password.matches("^[a-zA-Z0-9._-]{3,20}$") && confirmPassword.equals(password)) {
            return "логин успешно добавлен!";
        } else {
            throw new WrongPasswordException();
        }
    }
}