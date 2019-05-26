package com.zvz.study.vp.template;

import com.zvz.study.vp.template.element.Element;
import com.zvz.study.vp.template.visitor.Visitor;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
//获得元素对象
            Element el = ObjectStruture.createElement();
//接受访问者访问
            el.accept(new Visitor());
        }
    }
}
