package com.werockstar;

import com.werockstar.config.DemoConfig;
import com.werockstar.config.RandomDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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


    @Autowired
    JdbcTemplate template;

    @RequestMapping("/stocks")
    public List<Map<String, Object>> stocks() {
        return template.queryForList("SELECT *FROM stock");
    }


    @RequestMapping("/")
    public String index() {
        // String value = args.getOptionNames().iterator().next();
        return name + " Living...";
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
