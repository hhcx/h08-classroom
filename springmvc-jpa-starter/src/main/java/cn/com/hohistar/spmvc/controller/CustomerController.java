package cn.com.hohistar.spmvc.controller;


import cn.com.hohistar.spmvc.biz.ICustomerBiz;
import cn.com.hohistar.spmvc.biz.impl.CustomerBizImpl;
import cn.com.hohistar.spmvc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/cust")
public class CustomerController {

    @Autowired
    @Qualifier("cust1")
    private ICustomerBiz customerBiz;

    @Autowired
    @Qualifier("cust2")
    private ICustomerBiz cusotmerBiz2;

    @GetMapping("/")
    public ModelAndView home() {
//        customerBiz = new CustomerBizImpl();

        List<Customer> listCustomer = customerBiz.listAll();
        ModelAndView mav = new ModelAndView("customer/index");
        mav.addObject("listCustomer", listCustomer);
        return mav;
    }

    @GetMapping("/new")
    public String create() {

        Customer cust = new Customer();
        cust.setName("jack");
        cust.setAddress("jack addrs");
        cust.setEmail("123@abc");
        customerBiz.create(cust);

       return "customer/index";

    }

}
