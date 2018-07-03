package com.zvz.study.singletonPattern.ordinary;

public class Singleton {

    private static final Singleton singleton = new Singleton();
    //限制产生多个对象
    private Singleton(){
    }
    //通过该方法获得实例对象
    public static Singleton getSingleton(){
        return singleton;
    }

    public  void doSomething(){

    }
}
