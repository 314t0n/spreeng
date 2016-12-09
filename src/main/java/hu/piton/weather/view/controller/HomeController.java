package hu.piton.weather.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    public static final String REQUEST_MAPPING = "/";

    @RequestMapping(value = REQUEST_MAPPING)
    public String home() {
        return "home";
    }
}
