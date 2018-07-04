package com.zvz.study.fmm.simple.Factory;

import com.zvz.study.fmm.simple.Phone.Phone;

public class PhoneFactory {

    public static <T extends Phone> T createPhone(Class<T> c){
//定义一个生产出的手机
        Phone phone=null;
        try {
//产生一个手机
            phone = (Phone)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("手机生成错误！");
        }
        return (T)phone;
    }
}
