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
        logger.debug("Creating BugucmsPlugin applicationContext");
        SpringPluginManager pluginManager = (SpringPluginManager) (this.getWrapper().getPluginManager());
        return pluginManager.getApplicationContext();
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