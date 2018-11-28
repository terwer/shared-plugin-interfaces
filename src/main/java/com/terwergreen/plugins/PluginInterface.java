package com.terwergreen.plugins;

import org.pf4j.ExtensionPoint;

import java.util.List;
import java.util.Map;

/**
 * @Author Terwer
 * @Date 2018/11/22 16:41
 * @Version 1.0
 * @Description 通用插件接口
 **/
public interface PluginInterface extends ExtensionPoint {
    /**
     * 插件描述信息
     *
     * @return
     */
    String identify();

    /**
     * webFlux映射列表
     *
     * @return
     */
    List<?> reactiveRoutes();

    /**
     * 暴露给外部使用的数据
     *
     * @return
     */
    Map data();
}
