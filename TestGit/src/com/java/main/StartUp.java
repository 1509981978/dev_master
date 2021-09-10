package com.java.main;

import com.java.test.GitTest;

public class StartUp {
    public static void main(String[] args) {
        new Thread(new GitTest()).start();
    }
}
