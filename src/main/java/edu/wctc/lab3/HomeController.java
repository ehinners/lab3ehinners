package edu.wctc.lab3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/view-cart")
    public String showCartPage() {
        return "pages/catalog/cart.html";
    }
    @RequestMapping




    @RequestMapping("/search")
    public String doRedirect() {
        return "redirect:http://www.google.com";
//        return "redirect:/glaciers/trail";
    }
}
