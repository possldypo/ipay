package com.vo;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Component
@Scope("prototype")
public class UserVO {

    @NotEmpty(message = "不得为空")
    @Min(value = 8, message = "用户名长度不能小于8！")
    @Max(value = 20, message = "用户名长度不能大于20！")
    private String userName;

    @NotEmpty(message = "不得为空")
    @Max(value = 20, message = "密码长度不能大于20！")
    @Min(value = 8, message = "密码长度不能小于8！")
    @Pattern(regexp = "^(?![a-zA-Z]+$)(?![A-Z0-9]+$)(?![A-Z\\W_]+$)(?![a-z0-9]+$)(?![a-z\\W_]+$)(?![0-9\\W_]+$)[a-zA-Z0-9\\W_]{8,}$",message = "密码中 大写字母，小写字母，数字，特殊符号必须四选三")
    private String password;

    @NotEmpty
    @Pattern(regexp = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\\\d{8}$", message = "手机号不符合规则")
    private String phone;

    private String address;

    private String sex;

    private String head;
}
