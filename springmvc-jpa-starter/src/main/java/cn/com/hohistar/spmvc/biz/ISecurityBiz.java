package cn.com.hohistar.spmvc.biz;

import cn.com.hohistar.spmvc.model.Account;

public interface ISecurityBiz {

    public Account login(String username, String pwd);
}
