package com.fcsc.docker.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 * @author ex-wangshiwu
 * @date 2019年12月23日
 */
@RestController
@RequestMapping("/test")
@CrossOrigin
public class TestController {
	
    /**
     * test
     * @describe 
     * @author ex-wangshiwu
     * @date 2019年12月23日
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "success";
    }
}
