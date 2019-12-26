package com.utils;

/**
 * @program: TestWork
 * @description: 二维码 先导入QRcode.jar
 * @author: pijunqi
 * @create: 2019-12-26 18:00
 **/

import com.swetake.util.Qrcode;
import jp.sourceforge.qrcode.QRCodeDecoder;
import jp.sourceforge.qrcode.data.QRCodeImage;
import jp.sourceforge.qrcode.exception.DecodingFailedException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 思路：
 * 1.将字符串写到图片中---qrCodeEncode
 * 2.从图片中解析出字符串---qrCodeDecode
 * 3.运行测试。
 */
public class QRCodeUtil {

    /**
     * 将字符串写到图片中
     *
     * @param encodeddata 已编码的数据
     * @param destFile    目标文件
     */
    public static void qrCodeEncode(String encodeddata, File destFile) throws IOException {
        Qrcode qrcode = new Qrcode();   // 二维码
        qrcode.setQrcodeErrorCorrect('M');  // 纠错级别（L 7%、M 15%、Q 25%、H 30%）和版本有关
        qrcode.setQrcodeEncodeMode('B');
        qrcode.setQrcodeVersion(7); // 设置qrcode包的版本

        byte[] d = encodeddata.getBytes("GBK"); // 字符集
        BufferedImage bi = new BufferedImage(139, 139, BufferedImage.TYPE_INT_RGB); //图像
        Graphics2D g = bi.createGraphics(); // 创建图层
        g.setBackground(Color.white);  // 设置背景颜色(白色)
        g.clearRect(0, 0, 139, 139); // 矩形 X,Y,width,height
        g.setColor(Color.BLACK);    // 设置图像颜色为黑色

        if (d.length > 0 && d.length < 123) {
            boolean[][] b = qrcode.calQrcode(d);
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j][i]) {
                        g.fillRect(j * 3 + 2, i * 3 + 2, 3, 3);
                    }
                }
            }
        }
        g.dispose();
        bi.flush();
        ImageIO.write(bi, "png", destFile);
    }

    /**
     * 解析二维码,返回解析内容
     *
     * @param imageFile
     * @return
     */
    public static String qrCodeDecode(File imageFile) {
        String decodedData = null;
        QRCodeDecoder qrCodeDecoder = new QRCodeDecoder();  // 解析二维码
        BufferedImage image = null;
        try {
            image = ImageIO.read(imageFile);
        } catch (DecodingFailedException | IOException dfe) {
            System.out.println("Error: " + dfe.getMessage());
        }
        return decodedData;
    }

    static class J2SEImage implements QRCodeImage {
        BufferedImage image;

        public J2SEImage(BufferedImage image) {
            this.image = image;
        }

        public int getWidth() {
            return image.getWidth();
        }

        public int getHeight() {
            return image.getHeight();
        }

        public int getPixel(int x, int y) {
            return image.getRGB(x, y);
        }
    }


    /**
     * 下面是测试类
     */
    /**
     * 运行测试
     *
     * @param args
     * @throws IOException
     */
//    public static void main(String[] args) throws IOException {
//        /**
//         *路径问题
//         */
//
////        mac地址如下->可将图片放置到桌面上。
////        String filePath = "/Users/eleven/Desktop/qrcode.png";
//
////        windows->可以使用这个路径,可以将图片放置在d盘下面
//        String filePath = "d:/qrcode1.png";
//        File file = new File(filePath);
//
//        // 二维码内容
//        try {
//            String encodedate = "http://how2j.cn?p=36286";
//            QRCodeUtil.qrCodeEncode(encodedate, file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // 解码
//        String reText = QRCodeUtil.qrCodeDecode(file);
//        System.out.println(reText);
//
//    }

}
