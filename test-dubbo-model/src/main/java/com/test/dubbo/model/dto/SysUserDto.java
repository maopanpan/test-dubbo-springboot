package com.test.dubbo.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 类名称：SysUserDto<br>
 * 类描述：<br>
 * 创建时间：2018年04月18日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Data
public class SysUserDto implements Serializable {
    //用户ID
    private Integer id;
    //用户名
    private String userName;
    //姓别
    private int sex;
    //邮箱
    private String email;
}
