package com.sweet.common.service;

import com.sweet.common.model.Book;

public interface BookService {
    public String findBookNameById(Integer id);

    public Book findBookById(Integer id);
}
