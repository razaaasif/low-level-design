package com.designpatterns.abstractfactory.feecalculator;

import com.designpatterns.abstractfactory.interfaces.FeeCalculator;

public class GeorgiaTechFeeCalculator implements FeeCalculator {
    @Override
    public int calculateFee() {
        return 11000;
    }
}
