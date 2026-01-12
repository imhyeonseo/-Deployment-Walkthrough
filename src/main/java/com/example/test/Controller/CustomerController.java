package com.example.test.Controller;

import com.example.test.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/test/customer")
    public String show(Model model) {
        model.addAttribute("customer", customerService.index());
        return "customer/index";
    }
}
