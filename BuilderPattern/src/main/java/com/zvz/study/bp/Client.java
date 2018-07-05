package com.zvz.study.bp;

import java.util.ArrayList;

public class Client {


        public static void main(String[] args) {
            Director director = new Director();
            for(int i=0;i<2;i++){
                director.getABenzModel().run();
            }
            for(int i=0;i<2;i++){
                director.getBBenzModel().run();
            }
            for(int i=0;i<2;i++){
                director.getCBMWModel().run();
            }
        }

}
