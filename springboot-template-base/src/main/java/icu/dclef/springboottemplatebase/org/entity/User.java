package icu.dclef.springboottemplatebase.org.entity;

import java.io.Serializable;
import lombok.Data;
/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-03-23 23:32:50
 */
@Data
//@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
public class User implements Serializable {
    private static final long serialVersionUID = 249773163496712990L;
            private Long id;

        private String username;

        private String password;

        private String nickName;




}

