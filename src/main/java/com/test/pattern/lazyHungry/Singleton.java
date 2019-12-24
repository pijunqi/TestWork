package com.test.pattern.lazyHungry;

/**
 * @program:
 * @description: 各种模式
 * @author: pijunqi
 * @create: 2019-12-04 17:36
 **/
//懒汉式
public class Singleton {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 1:懒汉式，静态工程方法，创建实例 */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}


//饿汉式
 class Singleton2 {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton2 instance = new Singleton2();

    /* 私有构造方法，防止被实例化 */
    private Singleton2() {
    }

    /* 1:懒汉式，静态工程方法，创建实例 */
    public static Singleton2 getInstance() {

        return instance;
    }

}