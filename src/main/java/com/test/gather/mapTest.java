package com.test.gather;

import com.utils.ConvertUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: springDemo
 * @description: map测试
 * @author: pijunqi
 * @create: 2019-12-05 16:53
 **/

public class mapTest {
    public static void main(String[] args) {
        //将map集合转换为list集合
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        // split a map into 2 List
//       [1={id=1, value=11}, 2={id=2, value=9}]

//        Collection<String> valueCollection2 = map.values();
//        List<String> valueList= new ArrayList<String>(valueCollection2);//map转list
//        System.out.println(valueList);
        System.out.println(map);
        ConvertUtils convertUtils = new ConvertUtils();
        List list = convertUtils.mapToList(map);
        System.out.println(list);
    }


}
