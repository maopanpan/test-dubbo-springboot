package com.test.dubbo.controller;

import com.test.dubbo.model.dto.SysUserDto;
import com.test.dubbo.service.SysUserService;
import org.springframework.web.bind.annotation.*;

/**
 * 类名称：SysUserController<br>
 * 类描述：<br>
 * 创建时间：2018年04月18日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@RestController
public class SysUserController {

    private final SysUserService sysUserService;

    public SysUserController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @RequestMapping(value = "/getSysUserByUserId", method = RequestMethod.GET)
    @ResponseBody
    public SysUserDto getSysUserByUserId(@RequestParam(value = "userId") Integer userId) {
        SysUserDto sysUserDto = sysUserService.getSysUserByUserId(userId);
        return sysUserDto;
    }
}
