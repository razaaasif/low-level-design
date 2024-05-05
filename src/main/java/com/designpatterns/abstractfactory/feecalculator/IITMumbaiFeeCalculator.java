package com.designpatterns.abstractfactory.feecalculator;

import com.designpatterns.abstractfactory.interfaces.FeeCalculator;

public class IITMumbaiFeeCalculator implements FeeCalculator {
    @Override
    public int calculateFee() {
        return 800;
    }
}
