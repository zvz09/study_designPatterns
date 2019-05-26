package com.zvz.study.cp.template.receiver;

public class ConcreteReciver2 extends Receiver {
    //每个接收者都必须处理一定的业务逻辑

    @Override
    public void doSomething() {
        System.out.println("ConcreteReciver2.doSomething ................");
    }
}