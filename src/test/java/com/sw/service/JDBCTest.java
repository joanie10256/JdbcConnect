package com.sw.service;

public class JDBCTest {
    public static void main(String[] args) {
        String type = "mysql";
        JDBCConnect.connect(type);
    }
}
