package com.zvz.study.afp.product.black;

import com.zvz.study.afp.product.Human;

public abstract class AbstractBlackHuman implements Human {
    //白色人种的皮肤颜色是白色的
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    //白色人种讲话
    public void talk() {
        System.out.println("黑色人种会说话");
    }
}
