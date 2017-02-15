package com.hezf.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/9.
 */
@RestController
public class RestfulApiWebDemo {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helleWorld(){
        return "hello World! I'm Hezfshide就哈哈";
    }

}
