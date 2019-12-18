package com.test.常用算法及排序;

import java.util.Arrays;

/**
 * @program: springDemo
 * @description: 选择排序算法 将数组排序后输出
 * @author: pijunqi
 * @create: 2019-12-18 17:02
 **/

/**
 * 实现思路是每一轮循环找到最小的值，依次排到数组的最前面，这样就实现了数组的有序排列
 */
public class SelectSort {
    public static void main(String[] args) {
        // 选择排序调用
        int[] selectNums = {18, 1, 6, 27, 15};
        System.out.println("排序前：" + Arrays.toString(selectNums));
        selectSort(selectNums);
        System.out.println("排序后：" + Arrays.toString(selectNums));
    }
    /**
     * 选择排序
     */
    private static void selectSort(int[] nums) {
        int index;
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            if (index != i) {
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            System.out.print("第" + i + "次排序：");
            System.out.println(Arrays.toString(nums));
        }
    }
}
