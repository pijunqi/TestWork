package com.test.常用算法及排序;

/**
 * @program:
 * @description: 二分法
 * @author: pijunqi
 * @create: 2019-12-18 16:47
 **/

public class dichotomy {
    public static void main(String[] args) {
        // 二分法查找
        int[] binaryNums = {1, 6, 15, 18, 27, 50};
        int findValue = 27;
        int binaryResult = binarySearch(binaryNums, 0, binaryNums.length - 1, findValue);
        System.out.println("元素第一次出现的位置（从0开始）：" + binaryResult);
    }
    /**
     * 二分查找，返回该值第一次出现的位置（下标从 0 开始）
     * 注意事项：二分法只适用于有序的数据，也就是说，数据必须是从小到大，或是从大到小排序的。否则错误
     * @param nums      查询数组
     * @param start     开始下标
     * @param end       结束下标
     * @param findValue 要查找的值
     * @return int
     */
    private static int binarySearch(int[] nums, int start, int end, int findValue) {
        if (start <= end) {
            // 中间位置
            int middle = (start + end) / 2;
            // 中间的值
            int middleValue = nums[middle];
            if (findValue == middleValue) {
                // 等于中值直接返回
                return middle;
            } else if (findValue < middleValue) {
                // 小于中值，在中值之前的数据中查找
                return binarySearch(nums, start, middle - 1, findValue);
            } else {
                // 大于中值，在中值之后的数据中查找
                return binarySearch(nums, middle + 1, end, findValue);
            }
        }
        return -1;
    }
}
