package cn.com.hohistar.spmvc.repository;

import cn.com.hohistar.spmvc.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}


