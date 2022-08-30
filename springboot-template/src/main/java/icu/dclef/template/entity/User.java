package icu.dclef.template.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-08-30 16:57:20
 */
@Data
//@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
public class User implements Serializable {
    private static final long serialVersionUID = 126216409328295919L;
    private Long id;

    private String username;

    private String password;

    private String nickName;


}

