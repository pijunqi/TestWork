package com.test;

/**
 * @program: TestWork
 * @description: lambada介绍
 * @author: pijunqi
 * @create: 2019-12-26 11:04
 **/
/**
 * lambada 使用条件
 * 1.接口当中只能有一个方法,
 * 2.有默认实现的方法除外
 * 3.Object类对应的方法除外
 * 用@FunctionalInterface 进行语法检测是否是函数式接口
 */

public class lambada {
    public static void main(String[] args) {
/**
 * (n,m)参数的声明 可以带类型 (String n,String m)
 * n+m 参数的实现
 */
//        单行表达式
        say((n,m)->n+m);

//        单行表达式
        say((String n,String m)->n+m);

//        语句块
        say((n,m)->{
           return n+m;
        });

//        静态方法引用
        say(lambada::sayHello);

//        非静态方法(实例对象)引用
        say(new lambada()::sayHelloNo);

//        参数对象引用
        /**
         * say(String::concat) 和 say((n,m)->n.concat(m))是一样的 concat是一个连接方法
         */
        say(String::concat);

    }

    static String sayHello(String name,String message){
        return name+message;
    }

     String sayHelloNo(String name,String message){
        return name+message;
    }

    /**
     * lambada 使用条件
     * 1.接口当中只能有一个方法,
     * 2.有默认实现的方法除外
     * 3.Object类对应的方法除外
     * 用@FunctionalInterface 进行语法检测
     */


    public static void say (myInterface myInterface){
        System.out.println(myInterface.sayHello("皮军旗", "good man"));
    }

    @FunctionalInterface
    public interface myInterface{
        public abstract String sayHello(String name,String message);

    }
}
