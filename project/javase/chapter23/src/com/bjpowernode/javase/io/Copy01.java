package com.bjpowernode.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 使用FileInputStream + FileOutPutStream完成文件的拷贝。
* 拷贝的过程应该是一边读，一边写。
* 使用以上的字节流拷贝文件的时候，文件类型随意，万能的。什么样的文件都能拷贝。
* */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建一个输入流对象
            fis = new FileInputStream("D:\\javase-进阶\\project\\javase\\myfile");
            //创建一个输出流对象
            fos = new FileOutputStream("D:\\javase-进阶\\project\\javase\\lalala");

            //最核心的：一边读，一边写
            byte[] bytes = new byte[1024 * 1024];  //1MB(一次最多拷贝1MB。)
            int readCount = 0;
            while((readCount = fis.read(bytes))!= -1){
                fos.write(bytes,0,readCount);
            }

            //刷新，输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (fis != null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
