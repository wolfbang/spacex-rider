package com.spacex.framework;


import com.spacex.framework.helper.BeanHelper;
import com.spacex.framework.helper.HelperLoader;
import com.spacex.framework.test.TestBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class IocBootstrapApp {
    private static Logger logger = LoggerFactory.getLogger(IocBootstrapApp.class);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        HelperLoader.init();
        TestBean testBean = BeanHelper.getBean(TestBean.class);
        logger.info(String.format("testBean:[%s]", testBean));

    }
}

