package com.test.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.dubbo.model.dto.SysUserDto;
import com.test.dubbo.service.SysUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 类名称：SysUserServiceImpl<br>
 * 类描述：<br>
 * 创建时间：2018年04月18日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Reference
    private SysUserService sysUserService;

    @Override
    public SysUserDto getSysUserByUserId(int userId) {
        return sysUserService.getSysUserByUserId(userId);
    }
}
