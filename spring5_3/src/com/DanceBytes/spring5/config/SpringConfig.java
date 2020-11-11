package com.DanceBytes.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 孟享广
 * @date 2020-11-11 4:45 下午
 * @description
 */
@Configuration  //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.DanceBytes"})
public class SpringConfig {
}
