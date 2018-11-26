package com.terwergreen.plugins;

import org.pf4j.DefaultPluginManager;
import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;
import org.pf4j.spring.SpringPlugin;
import org.pf4j.spring.SpringPluginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 * @Author Terwer
 * @Date 2018/11/26 18:47
 * @Version 1.0
 * @Description 公共插件基类
 **/
public class BugucmsPlugin extends SpringPlugin {
    private static final Logger logger = LoggerFactory.getLogger(DefaultPluginManager.class);

    public BugucmsPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    protected ApplicationContext createApplicationContext() {
        logger.info("BugucmsPlugin.createApplicationContext()");
        SpringPluginManager springPluginManager = (SpringPluginManager) (this.getWrapper().getPluginManager());
        ApplicationContext applicationContext = springPluginManager.getApplicationContext();
        logger.info("BugucmsPlugin.applicationContext=" + applicationContext);
        return applicationContext;
    }

    @Override
    public void start() throws PluginException {
        logger.info("BugucmsPlugin.start()");
        super.start();
    }

    @Override
    public void stop() {
        logger.info("BugucmsPlugin.stop()");
        super.stop();
    }
}