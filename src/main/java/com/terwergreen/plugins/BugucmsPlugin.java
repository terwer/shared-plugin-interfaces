package com.terwergreen.plugins;

import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;
import org.pf4j.spring.SpringPlugin;
import org.pf4j.spring.SpringPluginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;

import static org.springframework.beans.factory.config.AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE;

/**
 * @Author Terwer
 * @Date 2018/11/26 18:47
 * @Version 1.0
 * @Description 公共插件基类
 **/
public class BugucmsPlugin extends SpringPlugin {
    private static final Logger logger = LoggerFactory.getLogger(BugucmsPlugin.class);
    private ApplicationContext applicationContext;

    public BugucmsPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    /**
     * 公共获取上下文方法
     *
     * @return
     */
    public ApplicationContext getBugucmsApplicationContext() {
        if (this.applicationContext == null) {
            this.applicationContext = createApplicationContext();
        }
        return this.applicationContext;
    }

    /**
     * 公共的注册bean方法
     *
     * @param beanClass
     */
    public void registerBean(Class<?> beanClass) {
        ApplicationContext applicationContext = this.getBugucmsApplicationContext();
        if (null != applicationContext) {
            AutowireCapableBeanFactory beanFactory = applicationContext.getAutowireCapableBeanFactory();
            if (null != beanFactory) {
                beanFactory.autowire(beanClass, AUTOWIRE_BY_TYPE, true);
                logger.info("BugucmsPlugin autowire Bean " + beanClass + " in container " + applicationContext);
            }
        }
    }

    /**
     * 注册插件依赖的对象
     */
    public void registerPluginBeans() {
    }

    @Override
    protected ApplicationContext createApplicationContext() {
        applicationContext = ((SpringPluginManager) (this.getWrapper().getPluginManager())).getApplicationContext();
        logger.info("Creating applicationContext in BugucmsPlugin:" + applicationContext);
        registerPluginBeans();
        return applicationContext;
    }

    @Override
    public void start() throws PluginException {
        super.start();
        logger.debug("BugucmsPlugin started");
    }

    @Override
    public void stop() {
        super.stop();
        logger.debug("BugucmsPlugin stoped");
    }
}
