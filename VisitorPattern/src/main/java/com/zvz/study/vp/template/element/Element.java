package com.zvz.study.vp.template.element;

import com.zvz.study.vp.template.visitor.IVisitor;

public abstract class Element {
    //定义业务逻辑
    public abstract void doSomething();
    //允许谁来访问
    public abstract void accept(IVisitor visitor);
}