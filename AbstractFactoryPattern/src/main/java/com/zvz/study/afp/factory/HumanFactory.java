package com.zvz.study.afp.factory;

import com.zvz.study.afp.product.Human;

public interface HumanFactory {

    //制造一个白色人种
    public Human createWhiteHuman();
    //制造一个黑色人种
    public Human createBlackHuman();

}
