package com.test.dbPool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @program: springDemo
 * @description: 德鲁伊连接池
 * @author: pijunqi
 * @create: 2019-12-10 18:10
 **/

public class DruidDemo {
    public static void main(String[] args) throws Exception {
        //1 导入jar包
        //2 定义配置文件
        //3 加载配置文件          配置文件
        Properties pro = new Properties();
        //getClassLoader()方法是得到当前类型的类加载器
        //调用了类加载器的getResourceAsStream()方法来加载资源
        InputStream is = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        System.out.println(is);
        pro.load(is);
        //4 获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        System.out.println(ds+"000000000");
        //获取连接
        Connection connection = ds.getConnection();
        System.out.println(connection);


    }
}
