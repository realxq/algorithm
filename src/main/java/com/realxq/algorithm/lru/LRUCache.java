package com.realxq.algorithm.lru;

import com.realxq.algorithm.datatype.MyLink;

/**
 * 一个基于单链表实现的LRU缓存
 */
public class LRUCache {

    private static final MyLink myLink = new MyLink();

    public static String cacheList(){
        return myLink.toString();
    }

    //加入缓存
    public static void addCache(int d){
        if(myLink.length() >= 10){
            myLink.removeNode(1);
        }
        myLink.addNode(d);
    }

    /**
     * 使用缓存
     * 1. 将数据所在的节点从链表中删除
     * 2. 在尾部新增一个节点
     * @param d
     */
    public static void useCache(int d){
        boolean b = myLink.removeNodeByData(d);
        myLink.addNode(d);
    }



}
