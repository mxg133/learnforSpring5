package com.Dancebytes.spring5.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 孟享广
 * @date 2020-11-15 10:06 上午
 * @description
 */
public class UserLog {
    private static final Logger LOG = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        LOG.info("hello, log4j2.....");
        LOG.warn("warning ...log4j2....");
    }
}
