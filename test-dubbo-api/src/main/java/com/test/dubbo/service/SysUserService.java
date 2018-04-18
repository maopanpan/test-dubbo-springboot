package com.test.dubbo.service;

import com.test.dubbo.model.dto.SysUserDto;

/**
 * 类名称：SysUserService<br>
 * 类描述：获取用户信息<br>
 * 创建时间：2018年04月18日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public interface SysUserService {

    public SysUserDto getSysUserByUserId(int userId);
}
