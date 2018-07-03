package com.zvz.study.singletonPattern;

public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();

        singleton.doSomething();
    }

}
