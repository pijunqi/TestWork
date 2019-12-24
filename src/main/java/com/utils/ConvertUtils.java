package com.utils;

import com.domain.ExponseConstants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @program:
 * @description: map转换成list
 * @author: pijunqi
 * @create: 2019-12-05 17:38
 **/

public class ConvertUtils {



    //把map转换成list的公共方法
    public static List mapToList(Map map){
        List list=new ArrayList();
        Iterator it=map.keySet().iterator();
        System.out.println(it);
        System.out.println("0000000000000");
        while(it.hasNext()){
            String key=it.next().toString();
            System.out.println(key);
            System.out.println("111111111111");
            ExponseConstants exponseConstants=new ExponseConstants();
            exponseConstants.setKey(key);
            try {
                if (key!=null){
                    String s = map.get(key).toString();
    //            System.out.println(s);
                    System.out.println("22222222222");
                    exponseConstants.setValue(s);
                    list.add(exponseConstants);
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("异常");
            }

        }
        return list;
    }



}
