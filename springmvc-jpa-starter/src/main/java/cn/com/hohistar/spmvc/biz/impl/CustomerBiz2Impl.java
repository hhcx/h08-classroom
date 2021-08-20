package cn.com.hohistar.spmvc.biz.impl;

import cn.com.hohistar.spmvc.biz.ICustomerBiz;
import cn.com.hohistar.spmvc.model.Customer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

public class CustomerBiz2Impl implements ICustomerBiz {

    @Override
    public List<Customer> listAll() {

        return null;
    }

    @Override
    public Long create(Customer customer) {
        return null;
    }
}
