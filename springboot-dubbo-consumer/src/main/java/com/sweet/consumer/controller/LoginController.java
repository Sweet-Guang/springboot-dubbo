package com.sweet.consumer.controller;

import com.sweet.common.model.Book;
import com.sweet.common.service.BookService;
import com.sweet.common.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Reference
    public DemoService demoService;

    @Reference
    public BookService bookService;

    @RequestMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("title",demoService.sayHello("qwe"));
        return "index";
    }

    @RequestMapping(value = "")
    @ResponseBody
    public String findBookNameById( Integer id){
        return bookService.findBookNameById(id);
    }

    @RequestMapping(value = "/book")
    @ResponseBody
    public Book findBookById(Integer id){
        return bookService.findBookById(id);
    }


}
