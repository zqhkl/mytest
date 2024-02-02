package com.bjpowernode.javase.io;

import com.bjpowernode.javase.bean.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/*
* 反序列化集合
* */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users"));
        //Object obj = ois.readObject();
        //System.out.println(obj instanceof List);
        List<User> userList = (List<User>)ois.readObject();
        for (User user :userList){
            System.out.println(user);
        }
        ois.close();
    }
}
