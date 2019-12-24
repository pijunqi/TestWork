package com.test.常用算法及排序;

/**
 * @program:
 * @description: 插入排序算法
 * @author: pijunqi
 * @create: 2019-12-18 17:04
 **/

import java.util.Arrays;

/**
 * 依次把当前循环的元素，通过对比插入到合适位置的排序算法
 */

public class InsertionSort {
    public static void main(String[] args) {
        // 插入排序调用
        int[] insertNums = {18, 1, 6, 27, 15};
        System.out.println("排序前：" + Arrays.toString(insertNums));
        insertSort(insertNums);
        System.out.println("排序后：" + Arrays.toString(insertNums));
    }
    /**
     * 插入排序
     */
    private static void insertSort(int[] nums) {
        int i, j, k;
        for (i = 1; i < nums.length; i++) {
            k = nums[i];
            j = i - 1;
            // 对 i 之前的数据，给当前元素找到合适的位置
            while (j >= 0 && k < nums[j]) {
                nums[j + 1] = nums[j];
                // j-- 继续往前寻找
                j--;
            }
            nums[j + 1] = k;
            System.out.print("第" + i + "次排序：");
            System.out.println(Arrays.toString(nums));
        }
    }
}
