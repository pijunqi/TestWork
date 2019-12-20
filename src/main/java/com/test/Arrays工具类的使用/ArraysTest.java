package com.test.Arrays工具类的使用;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @program: TestWork
 * @description: asList, sort, toStream, equals, copyOf的用法
 * @author: pijunqi
 * @create: 2019-12-20 10:29
 **/

public class ArraysTest {
    String[]array=new String[]{"a","b","c","1","2","3"};
    Integer[] ints= new Integer[]{5,6,7,8,1,2,9};


/**
 * asList
 * 这个方法可以把数组转换成List,List提供了很多的操作方法，更便于使用。
 */
@Test
 public void test1(){
    List<String> lists = Arrays.asList(array);
    System.out.println(lists);

}

    /**
     * sort比较常用了，根据元素按照自然排序规则排序，也可以设置排序元素的起始位置。
     * parallelSort和sort一样 parallelSort则采用并行的排序算法排序.但是我自己测试，可能数据量太小，速度上并没有明显的变化。
     */
    @Test
    public void test2(){

        String s = Arrays.toString(array);
        System.out.println(s);
        System.out.println("未排序前:"+Arrays.deepToString(array));
//      Arrays.sort(array);
//        可以指定排序的开始和结束
//      Arrays.sort(array,2,5);
        Arrays.parallelSort(array);
        System.out.println("排序后:"+Arrays.deepToString(array));


        /**
         * Arrays.deepToString()主要用于数组中还有数组的情况，而Arrays.toString()则相反，
         * 对于Arrays.toString()而言，当数组中有数组时，不会打印出数组中的内容，只会以地址的形式打印出来。
         */
        int b[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.deepToString(b));

}

/**
 * binarySearch
 * 查找目标元素所在的位置，注意需要先进行排序。
 */
@Test
public void test3() {
//binarySearch需要保证是排好序的
    System.out.println(Arrays.binarySearch(array,"c"));//-6
    Arrays.sort(array);
    System.out.println(Arrays.binarySearch(array,"c"));//4
}

/**
 * copyOf
 * 拷贝数组，第一种用法，如果目标长度不够，会使用0进行补位。第二种用法，支持拷贝目标起始位置到结束为止的数组。
 */
@Test
public void test4() {
    //如果位数不够，需要补位
    String[] strings = Arrays.copyOf(array, 10);
    System.out.println(Arrays.deepToString(strings));
//    增强for使用
    for (String s:strings) {
        System.out.println(s);

    }

    System.out.println("----------------------------------------->");
    //如果位数够，就取最小的数组
    Integer[] result = Arrays.copyOf(ints, 3);
    for(int i : result){
        System.out.println(i);
    }
    System.out.println("----------------------------------------->");

    //将一个原始的数组original，从下标from开始复制，复制到上标to，生成一个新的数组。(i1是上表)
    result = Arrays.copyOfRange(ints,2,5);
    for(int i : result) {
        System.out.println(i);
    }
    }

    /**
     * deepEquals深度比较、deepHashCode生成hashcode、deepToString深度打印
     */
    @Test
    public void test5() {
        String[] array2 = new String[]{"a","c","2","1","b"};
        System.out.println(Arrays.deepEquals(array,array2));//深度比较两个数组是否相同

        System.out.println(Arrays.deepHashCode(array));
        System.out.println(Arrays.deepHashCode(array2));//如果两个数组deepEquals，那么他们的hashcode一定相同
        //格式化输出数组
        System.out.println(Arrays.deepToString(array));

    }

/**
 * fill
 * 基于目标元素填充数组
 */
@Test
public void test6() {
    System.out.println(Arrays.deepToString(array));
    Arrays.fill(array,"test");
    System.out.println(Arrays.deepToString(array));
}
/**
 * toStream
 * 把数组转换成stream,然后可以使用java8的stream特性了。
 */

@Test
public void test7() {
    Arrays.stream(array).forEach(s-> System.out.println(s));
}


    /**
     * parallelPrefix
     * 这个有点像spark的reduceByKey，即根据传入的方法一次计算：
     */
    @Test
    public void test8(){
        Arrays.parallelPrefix(ints,(x,y)->(x+y));
        System.out.println(Arrays.deepToString(ints));
    }

/**
 * parallelSetAll
 * 这个方法相当于stream.map会挨个元素遍历执行方法
 */

@Test
public void test9(){
    Arrays.parallelSetAll(ints,x->x*2);
    System.out.println(Arrays.toString(ints));
}




}
