package com.terwergreen;

import org.pf4j.ExtensionPoint;

import java.util.List;

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
     * webServlet映射列表
     *
     * @return
     */
    List<Object> mvcControllers();
}
