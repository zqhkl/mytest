package com.bjpowernode.javase.arry.homework;

import java.util.Scanner;

/*
* 为某个酒店编写酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
   1、该系统用户是：酒店前台。
   2、酒店使用一个二维数组来模拟。（Room[][] rooms）
   3、酒店中的每一个房间应该是一个Java对象:Room
   4、每一个房间Room应该有：房间编号、房间类型属性、房间是否空闲。
   5、系统应该对外提供的功能：
      可以预定房间：用户输入房间编号，订房。
      可以退房：用户输入房间编号，退房。
      可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。
* */
public class HotelMgtSystem {

    public static void main(String[] args){
        //创建酒店对象
        Hotel hotel  = new Hotel();
        //hotel.print();

        /*
        * 首先输出一个欢迎页面
        * */
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明：");
        System.out.println("功能编号对应的功能：[1]表示查看房间列表。[2]表示订房。[3]表示退房。[0]表表示退出系统");
        Scanner s = new Scanner(System.in);
        System.out.println("请输入功能编号：");
        int i = s.nextInt();
        if (i==1){
            //查看房间列表
            hotel.print();
        }
        else if (i==2){
            //订房
            System.out.println("请输入房间编号：");
            int roomNo =s.nextInt();
            hotel.order(roomNo);
        }
        else if (i==3){
            //退房
            System.out.println("请输入房间编号：");
            int roomNo = s.nextInt();
            hotel.exit(roomNo);
        }
        else if(i==0){
            //退出系统
            System.out.println("再见，欢迎下次再来");
            return;
        }
        else{
           //出错了
            System.out.println("输入功能编号有误！");
        }

    }
}
