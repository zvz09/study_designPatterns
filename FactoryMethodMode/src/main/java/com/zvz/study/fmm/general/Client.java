package com.zvz.study.fmm.general;

import com.zvz.study.fmm.general.creator.ConcreteCreator;
import com.zvz.study.fmm.general.creator.Creator;
import com.zvz.study.fmm.general.product.ConcreteProduct1;
import com.zvz.study.fmm.general.product.ConcreteProduct2;
import com.zvz.study.fmm.general.product.Product;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        Product product2 = creator.createProduct(ConcreteProduct2.class);
        /*
         * 继续业务处理
         */
    }
}
