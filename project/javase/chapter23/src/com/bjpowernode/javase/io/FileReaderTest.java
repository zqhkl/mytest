package com.bjpowernode.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* 文件字符输入流，只能读取普通文本。
* 读取文本内容时，比较方便，快捷。
* */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            //创建文件字符输入流
            reader = new FileReader("tempfile");

            //准备一个char数组
            char[] chars = new char[4]; //一次读取4个字符
            //往char数组中读
            reader.read(chars); //按照字符方式读取：第一次a,第二次b，第三次阿，第四次斯。
            for (char c : chars){
                System.out.println(c);
            }
         /*   //开始读
            char[] chars = new char[4]; //一次读取4个字符
            int readCount = 0;
            while ((readCount = reader.read(chars)) != -1){
                System.out.println(new String(chars,0,readCount));
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
