package cn.com.hohistar.spmvc.controller;


import cn.com.hohistar.spmvc.biz.ICustomerBiz;
import cn.com.hohistar.spmvc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/cust")
public class CustomerController {

    @Autowired
    private ICustomerBiz customerBiz;

    @GetMapping("/")
    public ModelAndView home() {
        List<Customer> listCustomer = customerBiz.listAll();
        ModelAndView mav = new ModelAndView("customer/index");
        mav.addObject("listCustomer", listCustomer);
        return mav;
    }

}
