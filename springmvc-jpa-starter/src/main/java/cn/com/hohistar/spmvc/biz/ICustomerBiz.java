package cn.com.hohistar.spmvc.biz;

import cn.com.hohistar.spmvc.model.Customer;

import java.util.List;

public interface ICustomerBiz {

    public List<Customer> listAll();

    public Long create(Customer customer);
}
