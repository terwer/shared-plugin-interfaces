package com.terwergreen.plugins;

import org.pf4j.ExtensionPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * @Author Terwer
 * @Date 2018/11/29 13:51
 * @Version 1.0
 * @Description 插件扩展点公共基类
 **/
public abstract class BugucmsPluginExtension implements ExtensionPoint {
    private static final Logger logger = LoggerFactory.getLogger(BugucmsPluginExtension.class);
    private GenericApplicationContext applicationContext;

    public BugucmsPluginExtension(){
    }

    public BugucmsPluginExtension(GenericApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        logger.info("Set applicationContext in BugucmsPluginExtension:" + applicationContext);
    }

    /**
     * 公共获取上下文方法
     *
     * @return
     */
    public GenericApplicationContext getBugucmsApplicationContext() {
        return this.applicationContext;
    }

    /**
     * 公共的注册bean方法
     *
     * @param beanClass
     */
    public void registerBean(Class<?> beanClass) {
        if (null != this.applicationContext) {
            this.applicationContext.registerBean(beanClass);
            logger.info("BugucmsPluginExtension register " + beanClass + " in container " + this.applicationContext);
        }
    }

    /**
     * 插件描述信息
     *
     * @return
     */
    public abstract String identify();

    /**
     * webFlux映射列表
     *
     * @return
     */
    public abstract List<?> reactiveRoutes();

    /**
     * 暴露给外部使用的数据
     *
     * @return
     */
    public abstract Map data();
}
