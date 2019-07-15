package com.sweet.provider.dao;

import com.sweet.common.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookMapper {

   //@Select("select name from book where id = #{id}")
    String findBookNameById(@Param("id") Integer id);

    Book findBookById(@Param("id") Integer id);
}
