package com.zvz.study.afp;

import com.zvz.study.afp.factory.FemaleFactory;
import com.zvz.study.afp.factory.HumanFactory;
import com.zvz.study.afp.factory.MaleFactory;
import com.zvz.study.afp.product.Human;

public class Client {



    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        //生产线建立完毕，开始生产人了:
        Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
        Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
        System.out.println("---生产一个白色女性---");
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.talk();
        femaleWhiteHuman.getSex();
        System.out.println("\n---生产一个白色男性---");
        maleWhiteHuman.getColor();
        maleWhiteHuman.talk();
        maleWhiteHuman.getSex();

    }

}
