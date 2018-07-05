package com.zvz.study.afp.factory;

import com.zvz.study.afp.product.Human;
import com.zvz.study.afp.product.black.MaleBlackHuman;
import com.zvz.study.afp.product.white.MaleWhiteHuman;

public class MaleFactory implements HumanFactory {
    //生产出黑人男性
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
    //生产出白人男性
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
