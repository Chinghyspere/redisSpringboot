package com.example.demo.controller;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */



import com.example.demo.interfaces.selectOne;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/redis/")
public class StudentController {

        @Resource(name = "serviceOneImpl")
        private selectOne serviceOneImpl;

        @RequestMapping("select")
        public  List<String>  select(){
            System.out.println(serviceOneImpl.getall());
            return serviceOneImpl.getall();
        }

}
