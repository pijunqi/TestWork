package com.test.二维码;

import com.utils.QRCodeUtil;

import java.io.File;
import java.io.IOException;

/**
 * @program: TestWork
 * @description:
 * @author: pijunqi
 * @create: 2019-12-26 18:08
 **/

public class 二维码测试 {

    /**
     * 运行测试
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        /**
         *路径问题
         */

//        mac地址如下->可将图片放置到桌面上。
//        String filePath = "/Users/eleven/Desktop/qrcode.png";

//        windows->可以使用这个路径,可以将图片放置在d盘下面
        String filePath = "d:/qrcode1.png";
        File file = new File(filePath);

        // 二维码内容
        try {
            String encodedate = "http://how2j.cn?p=36286";
            QRCodeUtil.qrCodeEncode(encodedate, file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 解码
        String reText = QRCodeUtil.qrCodeDecode(file);
        System.out.println(reText);

    }
}
