package com.terwergreen.plugins;

import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Terwer
 * @Date 2018/11/29 13:51
 * @Version 1.0
 * @Description 插件扩展点公共基类
 **/
@Extension
public abstract class BugucmsPluginExtension {
    private static final Logger logger = LoggerFactory.getLogger(BugucmsPluginExtension.class);
    private ApplicationContext applicationContext;

    /**
     * 公共获取上下文方法
     *
     * @return
     */
    public ApplicationContext getBugucmsApplicationContext() {
        return this.applicationContext;
    }

    /**
     * 公共的注册bean方法
     *
     * @param beanClass
     */
    public void registerBean(Class<?> beanClass) {
        AnnotationConfigApplicationContext applicationContext = (AnnotationConfigApplicationContext) getBugucmsApplicationContext();
        if (null != applicationContext) {
            applicationContext.register(beanClass);
            logger.info("BugucmsPluginExtension register " + beanClass + " in container " + applicationContext);
        }
    }

    /**
     * 设置扩展点上下文
     *
     * @param applicationContext
     */
    public void createApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        logger.info("Set applicationContext in BugucmsPluginExtension:" + applicationContext);
    }
}
