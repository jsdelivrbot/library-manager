package com.hezf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/2/10.
 */

@Controller
public class IndexController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(ModelMap map){
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "Hello World! I'm Hezf");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
