# 项目简介

简易版本的 tomcat 实现。

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.houbb/minicat/badge.svg)](http://mvnrepository.com/artifact/com.github.houbb/minicat)
[![Build Status](https://www.travis-ci.org/houbb/minicat.svg?branch=master)](https://www.travis-ci.org/houbb/minicat?branch=master)
[![Coverage Status](https://coveralls.io/repos/github/houbb/minicat/badge.svg?branch=master)](https://coveralls.io/github/houbb/minicat?branch=master)

# 特性

- 简单的启动实现

- servlet 支持

- 静态网页支持

# 变更日志

> [变更日志](CHANGE_LOG.md)

# 快速开始

## maven 依赖

```xml
<dependency>
    <groupId>com.github.houbb</groupId>
    <artifactId>minicat</artifactId>
    <version>0.3.0</version>
</dependency>
```

## 启动测试

```java
MiniCatBootstrap bootstrap = new MiniCatBootstrap();
bootstrap.start();
```

启动日志：

```
[INFO] [2024-04-03 11:09:15.178] [main] [c.g.h.m.s.s.WebXmlServletManager.register] - [MiniCat] register servlet, url=/my, servlet=com.github.houbb.minicat.support.servlet.MyMiniCatHttpServlet
[INFO] [2024-04-03 11:09:15.180] [Thread-0] [c.g.h.m.b.MiniCatBootstrap.startSync] - [MiniCat] start listen on port 8080
[INFO] [2024-04-03 11:09:15.180] [Thread-0] [c.g.h.m.b.MiniCatBootstrap.startSync] - [MiniCat] visit url http://127.0.0.1:8080
```

页面访问：[http://127.0.0.1:8080](http://127.0.0.1:8080)

响应：

```
http://127.0.0.1:8080
```

# ROAD-MAP

- [x] servlet 标准支持
- [] 请求线程池支持

- [] 加载 war 包
- [] 内嵌支持？
- [] NIO 实现