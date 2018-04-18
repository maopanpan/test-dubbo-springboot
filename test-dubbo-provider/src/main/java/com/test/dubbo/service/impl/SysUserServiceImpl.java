package com.test.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.dubbo.model.dto.SysUserDto;
import com.test.dubbo.service.SysUserService;
import org.springframework.stereotype.Component;

/**
 * 类名称：SysUserServiceImpl<br>
 * 类描述：<br>
 * 创建时间：2018年04月18日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Service(interfaceClass = SysUserService.class)
@org.springframework.stereotype.Service
public class SysUserServiceImpl implements SysUserService {

    @Override
    public SysUserDto getSysUserByUserId(int userId) {
        SysUserDto sysUserDto = new SysUserDto();
        sysUserDto.setId(10001);
        sysUserDto.setUserName("ZhangSan");
        sysUserDto.setSex(1);
        sysUserDto.setEmail("ZhangSan@163.com");
        return sysUserDto;
    }
}
