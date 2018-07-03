package com.zvz.study.singletonPattern.ordinary;

public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();

        singleton.doSomething();
    }

}
