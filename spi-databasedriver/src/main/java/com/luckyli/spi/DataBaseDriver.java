package com.luckyli.spi;

/**
 * 基础数据库服务,对外提供数据库连接服务;
 * 主要声明接口,MYSQL,ORACLE对其进行接口实现;
 */
public interface DataBaseDriver {
    String Connect(String host);
}
