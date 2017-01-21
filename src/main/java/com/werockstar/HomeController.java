package com.werockstar;

import com.werockstar.config.DemoConfig;
import com.werockstar.config.RandomDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Import(DemoConfig.class)
public class HomeController {

    @Value("${name}")
    String name;

    @Autowired
    String message;

    @Autowired
    RandomDemo demo;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return name;
    }

    @RequestMapping("/message")
    public String message() {
        return message;
    }

    @RequestMapping("/random")
    public String random() {
        return "Random int : " + demo.getMessage();
    }

}
