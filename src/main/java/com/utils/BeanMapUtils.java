package com.utils;


import org.springframework.cglib.beans.BeanMap;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @program: springDemo
 * @description: JavaBean、Map互相转换，List JavaBean 、List Map互相转换工具类
 * @author: pijunqi
 * @create: 2019-12-05 17:34
 **/

public class BeanMapUtils {
    /**
     * 将对象装换为map
     *
     * @param bean
     * @return
     */
    public static <T> Map<String, Object> beanToMap(T bean) {
        Map<String, Object> map = new HashMap<>();
        if (bean != null) {
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()) {
                map.put(String.valueOf(key), beanMap.get(key));
            }
        }
        return map;
    }

    /**
     * 将map装换为javabean对象
     *
     * @param map
     * @param bean
     * @return
     */
    public static <T> T mapToBean(Map<String, Object> map, T bean) {
        BeanMap beanMap = BeanMap.create(bean);
        beanMap.putAll(map);
        return bean;
    }

    /**
     * 将List<T>转换为List<Map<String, Object>>
     *
     * @param objList
     * @return
     */
    public static <T> List<Map<String, Object>> beansToMaps(List<T> objList) {
        List<Map<String, Object>> list = Collections.emptyList();
        if (objList != null && objList.size() > 0) {
            list = new ArrayList<>(objList.size());
            Map<String, Object> map;
            T bean;
            for (int i = 0, size = objList.size(); i < size; i++) {
                bean = objList.get(i);
                map = beanToMap(bean);
                list.add(map);
            }
        }
        return list;
    }

    /**
     * 将List<Map<String,Object>>转换为List<T>
     *
     * @param maps
     * @param clazz
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static <T> List<T> mapsToBeans(List<Map<String, Object>> maps, Class<T> clazz) {

        List<T> list = Collections.emptyList();
        if (maps != null && maps.size() > 0) {
            list = new ArrayList<>(maps.size());
            Map<String, Object> map;
            T bean;
            try {
                for (int i = 0, size = maps.size(); i < size; i++) {
                    map = maps.get(i);
                    bean = mapToBean(map, clazz.getDeclaredConstructor().newInstance());
                    list.add(bean);
                }
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (NoSuchMethodException ex) {
                ex.printStackTrace();
            } catch (InvocationTargetException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }

    //把bean 转换为 map
//    public static void main(String[] args) {
//        //bean to map
//        Message msg = new Message(1, "message one", new Date());
//        Map<String, Object> msgMap = beanToMap(msg);
//        System.out.println("bean to map: "+msgMap.toString());
//
//        //map to bean
//        msg = mapToBean(msgMap, new Message());
//        System.out.println("map to bean: "+msg.toString());
//
//        List<Message> msgs = new ArrayList<>();
//        msgs.add(new Message(2, "message two", new Date()));
//        msgs.add(new Message(4, "message three", new Date()));
//
//        //listBean to listMap
//        System.out.println("\nlistBean to listMap: ");
//        List<Map<String, Object>> msgMaps = beansToMaps(msgs);
//        msgMaps.forEach(System.out::println);
//
//        //listMap to listBean
//        System.out.println("\nlistMap to listBean: ");
//        msgs = mapsToBeans(msgMaps,Message.class);
//        msgs.forEach(System.out::println);
//
//    }
}
