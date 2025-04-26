package com.example.demo;

public class MyRunable implements Runnable{
    public void run() {
        System.out.println("Important work explained");
        System.out.println("Run by" + Thread.currentThread().getName());

    }
}
