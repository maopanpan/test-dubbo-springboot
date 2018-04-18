package com.test.dubbo.test;

import com.test.dubbo.ControllerTestBase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URI;

/**
 * 类名称：SysUserControllerTest<br>
 * 类描述：<br>
 * 创建时间：2018年04月18日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class SysUserControllerTest extends ControllerTestBase {

    @Test
    public void getSysUserByUserId() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI.create("/getSysUserByUserId"))
                .param("userId", "1");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        Assert.assertEquals(200, result.getResponse().getStatus());
    }
}
