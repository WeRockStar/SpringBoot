package com.werockstar;

import com.werockstar.config.DemoConfig;
import com.werockstar.config.RandomDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@Import(DemoConfig.class)
public class HomeController {

    @Value("${name}")
    String name;

    @Autowired
    RandomDemo demo;

    @Autowired
    ApplicationArguments args;

    @RequestMapping("/")
    public String index() {
        // String value = args.getOptionNames().iterator().next();
        return name;
    }

    @RequestMapping("/body")
    @ResponseBody
    public Sample sample() {
        return new Sample("01", "WeRockStar");
    }

    @RequestMapping("/viewresolver")
    public String viewResolver() {
        return "viewresolver";
    }

    @RequestMapping("/random")
    public String random() {
        return "Random int : " + demo.getMessage();
    }

}
