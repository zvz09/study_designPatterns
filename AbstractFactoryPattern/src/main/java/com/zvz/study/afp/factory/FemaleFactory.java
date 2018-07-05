package com.zvz.study.afp.factory;

import com.zvz.study.afp.product.Human;
import com.zvz.study.afp.product.black.FemaleBlackHuman;
import com.zvz.study.afp.product.white.FemaleWhiteHuman;

public class FemaleFactory implements HumanFactory {

    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
