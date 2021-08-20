package cn.com.hohistar.spmvc.repository;

import cn.com.hohistar.spmvc.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    public Account findByName(String name);
}
