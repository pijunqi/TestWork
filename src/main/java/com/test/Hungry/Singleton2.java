package com.test.Hungry;

/**
 * @program: TestWork
 * @description: 饿汉式
 * @author: pijunqi
 * @create: 2019-12-24 19:23
 **/

//饿汉式
public class Singleton2 {
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
