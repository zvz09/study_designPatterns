package com.zvz.study.bp.builder;

import com.zvz.study.bp.model.BenzModel;
import com.zvz.study.bp.model.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();


    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }
}
