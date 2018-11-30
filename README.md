# shared-plugin-interfaces

#### 项目介绍
Share plugin interface for bugucms plugin system

#### 软件架构
此为BuguCMS通用插件接口，需要在本地maven库安装才能使用


#### 安装教程

1. 构建jar包

```
mvn package -DskipTests
```

2. 安装到本地maven库

```
mvn install:install-file -Dfile=target/shared-plugin-interfaces-3.2.0.jar -DgroupId=com.terwergreen -DartifactId=shared-plugin-interfaces -Dversion=3.2.0 -Dpackaging=jar
```

#### 使用说明

1. 在项目pom.xml中添加下面代码

```xml
<dependency>
    <groupId>com.terwergreen</groupId>
    <artifactId>shared-plugin-interfaces</artifactId>
    <version>3.2.0</version>
</dependency>
```

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request

#### 说明

2. BuguCMS官方网站 [www.terwergreen.com](http://www.terwergreen.com)
