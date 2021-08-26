package edu.wctc.lab3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fossils")
public class Orders {
    @RequestMapping("/trilobites")
    public String showTriloFacts() {
        return "pages/trilobites";
    }

    @RequestMapping("/facts")
    public String showFossilFacts() {
        return "pages/fossil-facts";
    }
}
