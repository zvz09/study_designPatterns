package com.zvz.study.vp.template.visitor;

import com.zvz.study.vp.template.element.ConcreteElement1;
import com.zvz.study.vp.template.element.ConcreteElement2;

public interface IVisitor {
    //可以访问哪些对象
    public void visit(ConcreteElement1 el1);
    public void visit(ConcreteElement2 el2);
}
