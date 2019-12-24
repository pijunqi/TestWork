package com.test.thread;

/**
 * @program:
 * @description: 多线程测试调用
 * @author: pijunqi
 * @create: 2019-12-09 17:02
 **/

public class thredT {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("main:"+i);
        }

    }

}
