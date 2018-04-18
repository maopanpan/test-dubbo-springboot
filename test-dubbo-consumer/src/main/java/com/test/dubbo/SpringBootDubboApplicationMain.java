package com.test.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 类名称：SpringBootApplicationMain<br>
 * 类描述：启动类<br>
 * 创建时间：2018年04月18日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@SpringBootApplication
@EnableDubboConfiguration
@ComponentScan(basePackages = "com.test.dubbo")
@Slf4j
public class SpringBootDubboApplicationMain {

    /**
     * 启动类
     * <p>
     * 修改记录:
     *
     * @param args
     * @return void
     * @author maopanpan  2018/4/18
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboApplicationMain.class, args);
        LOGGER.info("SpringBoot启动成功……");
    }
}
