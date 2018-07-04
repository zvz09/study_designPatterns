package com.zvz.study.fmm.simple;

import com.zvz.study.fmm.simple.Factory.PhoneFactory;
import com.zvz.study.fmm.simple.Phone.HuaWeiPhone;
import com.zvz.study.fmm.simple.Phone.IPhone;
import com.zvz.study.fmm.simple.Phone.Phone;

public class FuShiKang {


    public static void main(String[] args) {

        Phone huawei = PhoneFactory.createPhone(HuaWeiPhone.class);
        huawei.getBrand();

        Phone iPhone = PhoneFactory.createPhone(IPhone.class);
        iPhone.getBrand();
    }

}
