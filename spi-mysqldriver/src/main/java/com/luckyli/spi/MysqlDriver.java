package com.luckyli.spi;

public class MysqlDriver implements DataBaseDriver{

    @Override
    public String Connect(String s) {
        return "begin build MYSQL connection";
    }
}
