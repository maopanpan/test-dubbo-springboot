package com.test.dubbo.test;

import com.test.dubbo.BaseTestCase;
import com.test.dubbo.model.dto.SysUserDto;
import com.test.dubbo.service.SysUserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类名称：SysUserServiceTest<br>
 * 类描述：<br>
 * 创建时间：2018年04月18日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class SysUserServiceTest extends BaseTestCase {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void getSysUserByUserId() {
        SysUserDto sysUserDto = sysUserService.getSysUserByUserId(1);
        Assert.assertNotNull(sysUserDto);
    }
}
