package cn.com.hohistar.spmvc.biz.impl;

import cn.com.hohistar.spmvc.biz.ISecurityBiz;
import cn.com.hohistar.spmvc.model.Account;
import cn.com.hohistar.spmvc.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecurityBizImpl implements ISecurityBiz {

    @Autowired
    private AccountRepository accountRepository;


    @Override
    public Account login(String username, String pwd) {

        Account account = null;

        account = accountRepository.findByName(username);
        if (account != null) {
            if (account.getPassword().equals(pwd)) {
                return account;
            }
        }
        return null;
    }
}
