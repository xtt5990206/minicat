package com.github.houbb.minicat.bs;

import java.util.concurrent.TimeUnit;

public class MiniCatBootstrapMain {

    public static void main(String[] args) throws InterruptedException {
        MiniCatBootstrap bootstrap = new MiniCatBootstrap();
        bootstrap.start();

        System.out.println("main START sleep");
        TimeUnit.SECONDS.sleep(30);
        System.out.println("main END sleep");

        bootstrap.stop();
    }

}
