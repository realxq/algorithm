package com.realxq.algorithm.lru;


public class LRUCacheTest {

    public static void main(String[] args) {
        LRUCache.addCache(1);
        LRUCache.addCache(2);
        LRUCache.addCache(3);
        LRUCache.addCache(4);
        LRUCache.addCache(5);
        LRUCache.addCache(6);
        LRUCache.addCache(7);
        LRUCache.addCache(8);
        LRUCache.addCache(9);
        LRUCache.addCache(10);
        System.out.println("当前缓存中数据");
        System.out.println(LRUCache.cacheList());
        LRUCache.addCache(11);
        System.out.println("超出缓存列表，当前缓存数据");
        System.out.println(LRUCache.cacheList());
        LRUCache.useCache(2);
        System.out.println("使用缓存2，当前的缓存数据");
        System.out.println(LRUCache.cacheList());
    }
}
