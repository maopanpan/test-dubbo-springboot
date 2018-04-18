package com.test.dubbo;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 类名称：ControllerTestBase<br>
 * 类描述：Rest层测试类<br>
 * 创建时间：2018年04月18日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class ControllerTestBase extends BaseTestCase {
    protected MockMvc mockMvc;
    @Autowired
    private WebApplicationContext wac;
    @Before
    public void init() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
}
