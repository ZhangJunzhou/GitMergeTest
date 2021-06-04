package com.zjz.controller;

import com.zjz.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjunzhou
 * @date 2021/5/27 11:03 上午
 */

@RestController
public class FirstController {
    @Autowired
    private Dog dog;

    @RequestMapping("/first")
    public String index(){
        return "dog name is " + dog.getName();
    }

}
