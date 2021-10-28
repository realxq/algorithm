package com.realxq.algorithm.datatype;

/**
 * 数据类型：链表
 */
public class MyLink {

    Node head = null; //头结点

    static class Node {
        Node next = null;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void addNode(int n){
        Node node = new Node(n);
        if(head == null){
            head = node;
            return ;
        }
        Node tmp = head;
        //遍历到最后一个节点
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    /**
     * 通过索引删除节点
     * @param index
     */
    public boolean removeNode(int index){
        if(index < 1 || index > length()){
            return false;
        }
        if(index == 1){
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while(curNode != null){
            if(i == index){
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    /**
     * 通过节点数据删除节点
     * @param d
     * @return
     */
    public boolean removeNodeByData(int d){
        Node tmp = head;
        int index = 0;
        while(tmp != null){
            if(tmp.data == d){
                return removeNode(index+1);
            }
            tmp = tmp.next;
            index ++;
        }
        return false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node tmp = head;
        while(tmp != null){
            sb.append(tmp.data);
            if(tmp.next != null){
                sb.append(",");
            }
            tmp = tmp.next;
        }
        return sb.toString();
    }

    /**
     * 获取链表的长度
     * @return
     */
    public int length(){
        int length = 0;
        Node tmp = head;
        while(tmp != null){
            length += 1;
            tmp = tmp.next;
        }
        return length;
    }


    public static void main(String[] args) {
        MyLink myLink = new MyLink();
        myLink.addNode(1);
        myLink.addNode(2);
        myLink.addNode(10);
        myLink.addNode(5);
        myLink.length();
        boolean b = myLink.removeNodeByData(10);
        System.out.println(b);
        System.out.println(myLink.toString());
//        Node n = new Node(10);
//        System.out.println(myLink.toString());
//        myLink.removeNode(1);
//        System.out.println(myLink.toString());
    }

}
