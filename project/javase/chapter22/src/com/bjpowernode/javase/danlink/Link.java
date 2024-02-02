package com.bjpowernode.javase.danlink;

/*
* 链表类
* */
public class Link <E>{
    public static void main(String[] args) {
        Link<String> link = new Link<>();
        link.add("abc");
        //类型不匹配。
        //link.add(123);
    }

    //头节点
    Node header = null;

    int size = 0;

    public int size(){
        return size;
    }

    //向链表中添加元素的方法（向末尾添加）
    public void add(E data){
    //public void add(Object data){
        //创建一个新的节点对象
        //让之前单链表的末尾节点的next指向新节点对象。
        //有可能这个元素是第一个，也可能是第二个，也可能是第三个。
        if (header == null){
            //说明还没有节点。
            //new一个新的节点对象，作为头节点对象。
            //这个时候的头节点既是一个头节点，又是一个末尾节点。
            header = new Node(data,null);
        }else{
            //说明头不是空！
            //头节点已经有了
            //找出当前末尾节点，让当前末尾节点的next是新节点。
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data,null);
        }
        size++;

    }

    /**
     * 专门查找末尾节点的方法
     * @param
     * @return
     */
    private Node findLast(Node node) {
        if (node.next == null){
            //如果一个节点的next是null
            //说明这个节点就是末尾节点
            return node;

        }
        //程序能够到这里说明:node不是末尾节点。
        return findLast(node.next); //递归算法
    }

    //删除链表中某个数据的方法
    public void remove(Object obj){

    }

    //修改链表中某个数据的方法
    public void modify(Object newObj){

    }

    //查找链表中某个元素的方法。
    public Object find(Object obj){
        return 1;
    }
}
