package com.luckyli.spi;

public class OracleDriver implements DataBaseDriver {
    @Override
    public String Connect(String s) {
        return "begin build ORACLE connection";
    }
}
