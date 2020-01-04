package com.test.commons_io_jar的使用;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: TestWork
 * @description: commons-io.jar的使用
 * @author: pijunqi
 * @create: 2020-01-04 10:42
 **/

public class commons {
    public static void main(String[] args) throws IOException {
        // 获取文件夹的大小，返回long类型
        long fileSize = (long) FileUtils.sizeOfDirectory(new File("d:\\software")); // 获取文件夹的大小，返回long类型
        System.out.println(fileSize);
        System.out.println("666");

        File file = new File("d:\\software");
        long fileSize1 = FileUtils.sizeOf(file); //获取文件或者文件夹的大小，其实这个方法的使用范围比上一个范围更广，我们来看看这个
        System.out.println(fileSize1);

        //调用方法
        String lujing = "d:\\a.txt";
        checkExists(lujing);

        //调用方法
        amend();

        //调用方法
        ReadAndModify();

    }

    /**
     * 如果文件不存在 创建文件
     *
     * @param filepath
     * @return
     */
    public static File checkExists(String filepath) {
        File file = new File(filepath);
        if (!file.exists()) {// 判断文件目录不存在
            File file2 = new File(file.getParent());
            file2.mkdirs();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }


    /**
     * 在本地新建一个文件夹  里面创建一个文件  向里面写入内容
     * 如果里面有内容会删掉重新写
     */
    public static void amend() throws IOException {

        //1. 文件夹的路径  文件名
        String directory = "d:\\test";
        String filename = "test.txt";

        //2.  创建文件夹对象     创建文件对象
        File file1 = new File(directory);
        //如果文件夹不存在  就创建一个空的文件夹
        if (!file1.exists()) {
            file1.mkdirs();
        }
        File file2 = new File(directory, filename);
        //如果文件不存在  就创建一个空的文件
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //3.写入数据
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream(directory + "\\" + filename);
        //开始写
        String str = "皮军旗";
        byte[] bytes = str.getBytes();
        //将byte数组中的所有数据全部写入
        fos.write(bytes);
        //关闭流
        fos.close();
    }

    public static void ReadAndModify() throws IOException {
/** 读取本地一个文件中的内容  写入另一个文件 */
        //创建文件字节输出流  这个路径下的文件必须存在
        FileInputStream fis = new FileInputStream("d:\\test\\test.txt");
        //创建文件字节输入流   如果这个文件不存在  会自动创建一个
        FileOutputStream fos = new FileOutputStream("d:\\b.txt");
        //一边读一边写
        byte[] bytes = new byte[1024];
        int temp = 0;
/**
 * 本来是这样写的会报异常 java.lang.IndexOutOfBoundsException
 *  while ((temp = (fis.read(bytes))) != 0) {
 *  数组获取越界了
 */

        while ((temp = (fis.read(bytes) + 1)) != 0) {
            //将byte数组中内容直接写入
            fos.write(bytes, 0, temp);
        }
        //刷新
        fos.flush();
        //关闭
        fis.close();
        fos.close();
    }


}
