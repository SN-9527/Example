package cc.nireus.simple.model;

import lombok.Data;

@Data
public class Account {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Integer status;  // 0:禁用 1:启用
}
