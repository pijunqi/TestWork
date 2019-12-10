package com.test.thread;

/**
 * @program: springDemo
 * @description: 多线程测试
 * @author: pijunqi
 * @create: 2019-12-09 16:54
 **/
//继承Thread类
public class ThreadTest extends Thread {

    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("run:"+i);
        }

    }



}
