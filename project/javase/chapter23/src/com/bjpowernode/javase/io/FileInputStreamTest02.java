package com.bjpowernode.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 对第一个程序进行改进。循环方式。
*
* 分析这个程序的缺点：
*   一次读取一个字节byte，这样内存和硬盘交互太频繁，基本上时间/资源都耗费在
*   交互上面了。能不能一次读取多个字节呢？
* */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\javase-进阶\\temp.txt");
          /*  while (true){
                int readDate = fis.read();
                if (readDate == -1){
                    break;
                }
                System.out.println(readDate);
            }*/

            //改造while循环
            int readData = 0;
            while((readData = fis.read()) != -1){
                System.out.println(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
