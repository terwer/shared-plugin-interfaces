# shared-plugin-interfaces

#### 项目介绍
Share plugin interface for bugucms plugin system

#### 软件架构
此为BuguCMS通用插件接口，需要在本地maven库安装才能使用

#### 安装教程

```
cd $WORKSPACE
chmod +x install.sh
./install.sh
```

#### 使用说明

1. 在项目pom.xml中添加下面代码

```xml
<dependency>
    <groupId>com.terwergreen</groupId>
    <artifactId>shared-plugin-interfaces</artifactId>
    <version>4.1.13</version>
</dependency>
```