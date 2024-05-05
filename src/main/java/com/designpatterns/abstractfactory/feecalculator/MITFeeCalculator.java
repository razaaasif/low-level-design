package com.designpatterns.abstractfactory.feecalculator;

import com.designpatterns.abstractfactory.interfaces.FeeCalculator;

public class MITFeeCalculator implements FeeCalculator {
    @Override
    public int calculateFee() {
        return 12000;
    }
}
