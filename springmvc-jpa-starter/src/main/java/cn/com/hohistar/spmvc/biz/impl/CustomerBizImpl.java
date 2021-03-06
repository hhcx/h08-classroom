package cn.com.hohistar.spmvc.biz.impl;

import cn.com.hohistar.spmvc.biz.ICustomerBiz;
import cn.com.hohistar.spmvc.model.Customer;
import cn.com.hohistar.spmvc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cust1")
public class CustomerBizImpl implements ICustomerBiz {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> listAll() {

        return customerRepository.findAll();
    }

    @Override
    public Long create(Customer customer) {

        customer = customerRepository.save(customer);
        return customer.getId();
    }
}
