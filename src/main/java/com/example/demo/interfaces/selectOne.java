package com.example.demo.interfaces;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository("selectOne")
@Mapper
@Transactional
public interface selectOne {
    @Select("Select name from student")
    public List<String> getall();
}
