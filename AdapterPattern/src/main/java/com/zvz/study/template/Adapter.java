package com.zvz.study.template;

public class Adapter extends Adaptee implements Target {

    public void request() {
        super.doSomething();
    }
}
