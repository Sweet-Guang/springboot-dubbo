package com.sweet.provider.service;

import com.sweet.common.model.Book;
import com.sweet.common.service.BookService;
import com.sweet.provider.dao.BookMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public String findBookNameById(Integer id) {
        String  bookName = bookMapper.findBookNameById(id);
        return bookName;
    }

    @Override
    public Book findBookById(Integer id) {
        return bookMapper.findBookById(id);
    }
}
