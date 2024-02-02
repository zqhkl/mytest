package com.bjpowernode.javase.arry.homework;
/*
* 酒店的房间
* */
public class Room {
    //房间编号
    private int no;
    //房间类型
    private String type;
    //房间是否空闲。true表示空闲，房间可以被预定。 false表示占用，房间不能被预定。
    private boolean status;

    //构造方法
    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    //setter and getter
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Idea工具对于boolean类型的变量，生成的get方法的方法名是：isXxx()
    //如果你不喜欢，可以修改为getXxx
 /*   public boolean isStatus() {
        return status;
    }
*/
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    //equals方法重写

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Room){
            Room room = (Room)obj;
            if (room.no == this.no)
                return true;
        }
        return false;
    }


    //toString方法重写
    //把一个变量塞到一个字符串当中，口诀：加一个双引号，双引号中间加两个加号，两个加号中间加变量名。

   /* public String toString() {
        return  "["+no+","+type+","+(status ?"空闲":"占用")+"]";
    }*/

    @Override
    public String toString() {
        return "Room{" +
                "no=" + no +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
    }

    //编写一个临时程序测试一下
    //一行可以删除这个main方法
   /* public static void main(String[] args) {
        Room room = new Room();
        System.out.println(room);
    }*/
}
