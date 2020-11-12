package com.Dancebytes.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 孟享广
 * @date 2020-11-12 3:14 下午
 * @description
 */

@Configuration
@ComponentScan(basePackages = {"com.DanceBytes"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}