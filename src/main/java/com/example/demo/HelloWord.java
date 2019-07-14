package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wuqiang on 2019/7/13
 */
@RestController
public class HelloWord
{

    @RequestMapping({"hi/{id}","hello/{id}"})
    public String helloword(@PathVariable("id") Integer id)
    {
        return "hello ****************" + id;
    }

    @RequestMapping(value = {"/HParame"}, method = RequestMethod.GET)
    public String hellowordParame(@RequestParam("id") Integer id)
    {
        return "hello ****************" + id;
    }
}
