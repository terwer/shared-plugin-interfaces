package com.terwergreen.plugins;

import com.terwergreen.util.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;
import org.pf4j.spring.SpringPlugin;
import org.pf4j.spring.SpringPluginManager;
import org.springframework.context.ApplicationContext;

/**
 * @Author Terwer
 * @Date 2018/11/26 18:47
 * @Version 1.0
 * @Description 公共插件基类
 **/
public class BugucmsPlugin extends SpringPlugin {
    private static final Log logger = LogFactory.getLog(PropertyUtils.class);

    public BugucmsPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    protected ApplicationContext createApplicationContext() {
        logger.debug("Creating BugucmsPlugin applicationContext");
        SpringPluginManager springPluginManager = (SpringPluginManager) (this.getWrapper().getPluginManager());
        ApplicationContext applicationContext = springPluginManager.getApplicationContext();
        logger.debug("BugucmsPlugin applicationContext is:" + applicationContext);
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