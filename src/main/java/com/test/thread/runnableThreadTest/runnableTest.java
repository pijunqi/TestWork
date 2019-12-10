package com.test.thread.runnableThreadTest;

/**
 * @program: springDemo
 * @description: ruannbleTest
 * @author: pijunqi
 * @create: 2019-12-09 17:21
 **/

public class runnableTest {
    public static void main(String[] args) {
        ruannableClass ruannableClass = new ruannableClass();
        //为了启动ruannableClass，需要首先实例化一个Thread，并传入自己的ruannableClass实例：
        Thread thread = new Thread(ruannableClass);
        thread.start();
    }

}
