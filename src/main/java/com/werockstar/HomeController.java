package com.werockstar;

import com.werockstar.config.DemoConfig;
import com.werockstar.config.RandomDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
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
    RandomDemo demo;

    @Autowired
    ApplicationArguments args;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        // String value = args.getOptionNames().iterator().next();
        return name;
    }

    @RequestMapping("/random")
    public String random() {
        return "Random int : " + demo.getMessage();
    }

}
