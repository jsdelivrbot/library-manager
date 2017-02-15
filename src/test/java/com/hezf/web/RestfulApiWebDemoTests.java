package com.hezf.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Administrator on 2017/2/9.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(RestfulApiWebDemo.class)
public class RestfulApiWebDemoTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testExample() throws Exception {
        this.mvc.perform(get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(content().string("hello World! I'm Hezfshide就哈哈"));
    }
}
