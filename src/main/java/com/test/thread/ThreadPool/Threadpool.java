package com.test.thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program:
 * @description: 线程池的工厂类, 用来生产线程池
 * @author: pijunqi
 * @create: 2019-12-10 16:54
 **/

public class Threadpool {
    public static void main(String[] args) {
        //1 生产一个线程池        线程池    新 固定   线程  池子  2为线程数量
        ExecutorService es = Executors.newFixedThreadPool(2);
        //3 调用ExecutorService中的方法submit,传递线程任务(实现类),开启线程,执行run方法
        //只要线程池不关闭 线程池中的线程可以一直使用
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        //关闭线程池 一般不建议
        //es.shutdown();

    }
}
