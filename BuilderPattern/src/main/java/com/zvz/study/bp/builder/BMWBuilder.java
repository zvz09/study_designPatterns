package com.zvz.study.bp.builder;

import com.zvz.study.bp.builder.CarBuilder;
import com.zvz.study.bp.model.BMWModel;
import com.zvz.study.bp.model.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
}
