package com.test.thread.ThreadPool;

/**
 * @program:
 * @description: 创建一个类 实现Runnable接口 重写run方法 设置线程任务
 * @author: pijunqi
 * @create: 2019-12-10 17:03
 **/

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        //2 Thread.currentThread().getName()获取线程的名字
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行");
    }
}
