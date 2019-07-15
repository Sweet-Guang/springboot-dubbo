package com.sweet.provider;

import com.sweet.common.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    @Autowired
    BookService bookService;

    @org.junit.Test
    public void testBookeService(){
        Integer id = 1;
        System.out.println("1111----" + bookService);
        String name =  bookService.findBookNameById(id);
        System.out.println("----name:" + name);
    }
}
