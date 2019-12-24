package com.test.lock;

import org.openjdk.jol.info.ClassLayout;

/**
 * @program:
 * @description: 锁机制
 * @author: pijunqi
 * @create: 2019-12-11 17:43
 **/

public class Test {
    static L l =new L();

    public static void main(String[] args) {
        //parse解析 Instance实例
        System.out.println( ClassLayout.parseInstance(l).toPrintable());



    }
}
