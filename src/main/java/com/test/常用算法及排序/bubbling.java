package com.test.常用算法及排序;

import java.util.Arrays;

/**
 * @program: springDemo
 * @description: 冒泡排序 将数组排序输出
 * @author: pijunqi
 * @create: 2019-12-18 17:00
 **/

/**
 * 通过相邻数据的交换达到排序的目的
 *  冒泡排序的执行流程是：
 * 对数组中相邻的数据，依次进行比较；
 * 如果前面的数据大于后面的数据，则把前面的数据交换到后面。经过一轮比较之后，就能把数组中最大的数据排到数组的最后面了；
 * 再用同样的方法，把剩下的数据逐个进行比较排序，最后得到就是从小到大排序好的数据。
 */
public class bubbling {
    public static void main(String[] args) {
        // 冒泡排序调用
        int[] bubbleNums = {132, 110, 122, 90, 50};
        System.out.println("排序前：" + Arrays.toString(bubbleNums));
        bubbleSort(bubbleNums);
        System.out.println("排序后：" + Arrays.toString(bubbleNums));
    }
    /**
     * 冒泡排序
     */
    private static void bubbleSort(int[] nums) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.print("第" + i + "次排序：");
            System.out.println(Arrays.toString(nums));
        }
    }
}
