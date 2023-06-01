package com.zhjava.lesson01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test01 {
    /*
    * 集合框架：
    *   1、为什么要有集合框架？
    *       数组存放数据有局限
    *   2、用来干嘛的？
    *       存放数据
    *   3、分类
    *       Collection
    *           List
    *               ArrayList
    *               LinkedList
    *               Vector
    *           Set
    *               HashSet
    *               TreeSet
    *   4、常用方法
    *       add：添加内容
    *       addAll：添加集合
    *       equals：比较两个集合是否相等
    *       isEmpty：判断集合是否为空
    *       size：集合大小
    *       clear：清空集合里的内容
    *       remove：删除内容
    *       removeAll：移除这个集合
    *       contains:是否包含这个内容
    *       containsAll：是否包含这个集合
    *   5、遍历集合
    *       1、迭代器
    *           1.1 与while联用，因为while里面有hasNext方法，用于判断下一个空间是否有值
    *           1.2 用法：Interator i=集合对象引用.Interator()
    *                   i.next();找到集合空间存放的某一个值
    *               while(hasNext()){
    *                   System.out.println(i.next());
    *               }
    *       2、foreach
    *           foreach(集合内容的数据类型 形参变量:要遍历的集合对象){
    *               System.out.println(i.next());
    *              }
    *   6、数据结构
    *       6.1 栈：先进后出，后进先出（有底座）
    *       6.2 队列：先进先出，后进后出（没有底座）
    *       6.3 数组：
    *           6.3.1 声明数组在内存中的操作：
    *                   首先在内存中开辟了一块空间
    *                   然后找到数组对应的地址值，找到这个数组
    *                   最后根据数据下标去找到对应内容的地址值
    *           6.3.2 特点：
    *               查询数据较快
    *               新增、删除数据较麻烦
    *       6.4 链表
    *           6.4.1 单向链表
    *               组成：一个内存空间划分了两个区域，前面存放数值，后面存放下一个空间的地址
    *               特点：新增、删除效率高
    *                   查询效率慢，从头开始查
    *           6.4.2 双向链表
    *               组成：一个空间划分了三个区域，中间存放数值，前面存放前一个空间地址值，后面存放后一个空间地址值
    *               特点：新增、删除相对单向链表比较麻烦
    *                   查询效率相对单向链表较快，比数组慢
    *   7、问题
    *       迭代器是啥？作用只能发挥一次？我下次再遍历，还得重新弄个迭代器对象？
    *       next()方法是啥作用
    *
    * */
    public static void main(String[] args) {
        Collection coll=new ArrayList();
        coll.add(234);
        coll.add(new String("hello"));
        coll.add(false);
        coll.add(3.45);

        Collection coll1=new ArrayList();
        coll1.add(666666);
        System.out.println(coll.equals(coll1));
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println("合并coll1后的内容："+coll);
        System.out.println("===========迭代器：for=============");
        //遍历集合中的内容
        //1、迭代器遍历
        Iterator i = coll.iterator();
        //1.1 for遍历，不常用
        for (int j = 0; j <coll.size() ; j++) {
            System.out.println(i.next());
        }
        System.out.println("============迭代器：while=============");
        //1.2 while遍历，常用，因为有hasNext方法
        //hasNext():判断下一个是否有值
        Iterator ii = coll.iterator();//为啥没有这句while的执行不了
        while(ii.hasNext()){
            //有值就执行
            System.out.println(ii.next());
        }
        System.out.println("============foreach遍历================");
        //把集合coll中第一个值赋值给变量o,然后遍历一次，知道遍历完这个集合
        for (Object o:coll) {
            System.out.println(o);
        }
    }
}
