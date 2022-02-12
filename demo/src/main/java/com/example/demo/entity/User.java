package com.example.demo.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * (User)实体类
 *
 * @author dclef
 * @since 2022-02-12 09:22:21
 */
@Data
//@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
public class User implements Serializable {
    private static final long serialVersionUID = -65749654130548187L;
    private Long id;

    private String username;

    private String password;

    private String nickName;


}

