package com.test.常用算法及排序;

/**
 * @program: springDemo
 * @description: 在斐波那契数列中查找位置
 * @author: pijunqi
 * @create: 2019-12-18 16:52
 **/

public class Fibonacci {
    public static void main(String[] args) {
        // 斐波那契数列
//        斐波那契数列指的是这样一个数列：0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711……
        int fibonacciIndex = 7;
        int fibonacciResult = fibonacci(fibonacciIndex);
        System.out.println("下标(从0开始)" + fibonacciIndex + "的值为：" + fibonacciResult);
    }
    /**
     * 斐波那契数列
     * @param index 斐波那契数列的下标（从0开始）
     * @return int
     */
    private static int fibonacci(int index) {
        if (index == 0 || index == 1) {
            return index;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }
}
