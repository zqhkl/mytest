package com.bjpowernode.javase.arry.homework;
/*
* 酒店对象，酒店中有二维数组，二维数组模拟大厦。
* */
public class Hotel {
    /*
    * 二维数组，模拟大厦所有的房间。
    * */
    private Room[][] rooms;

    //盖楼通过构造方法来盖楼。

    public Hotel() {
        //一共有几层，每层的房间类型是什么，每个房间的编号是什么。
        //我们可以先写死。一共三层，一层单人间、二层标准间、三层总统套房,每层有10个房间。
        /*
        * 房间编号的规律：
        * 1楼：101 102 103 104 105 106...
        * 2楼：201 202 203 204 205 206...
        * ....
        * */

        //动态初始化
        rooms= new Room[3][10];
        for (int i=0;i<rooms.length;i++){   //i是楼层
            for (int j =0;j<rooms[i].length;j++){
                if (i==0){
                rooms[i][j] = new Room((i+1)*100+j+1,"单人间",
                        true);
        }
            if (i==1){
                rooms[i][j] = new Room((i+1)*100+j+1,"标准间",
                        true);
            }
            if (i==2){
                rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",
                        true);
            }
    }

}
    }

    //在酒店对象上提供一个打印房间列表的方法。
    public void print(){
        //打印所有房间状态，就是遍历二维数组。
        for (int i =0;i<rooms.length;i++){
            for (int j =0;j<rooms[i].length;j++){
                System.out.print(rooms[i][j].getNo()+":"+rooms[i][j].getStatus()+"   ");
            }
            //换行
            System.out.println();
        }
    }

    //订房方法。调用此方法时需要传递一个房间编号过来。
    public void order(int roomNo){
        //订房最主要的是将房间对象的status修改为false。
        //Room对象的status修改为false
        //假设房间编号为207(下标为roos[1][6])
        rooms[roomNo/100-1][roomNo%100-1].setStatus(false);
    }

    //退房
    public void exit(int roomNo){
        //订房最主要的是将房间对象的status修改为false。
        //Room对象的status修改为false
        //假设房间编号为207(下标为roos[1][6])
        rooms[roomNo/100-1][roomNo%100-1].setStatus(true);
    }

}
