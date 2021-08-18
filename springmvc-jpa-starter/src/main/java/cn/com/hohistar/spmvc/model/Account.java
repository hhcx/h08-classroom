package cn.com.hohistar.spmvc.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@Table(name = "tbl_account")
@Data
@NoArgsConstructor
@Proxy(lazy = false)
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "id",nullable = false,length = 10)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "password", length = 100, nullable = false)
    private String password;

}
