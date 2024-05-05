package com.designpatterns.abstractfactory.feecalculator;

import com.designpatterns.abstractfactory.interfaces.FeeCalculator;

public class CalTechFeeCalculator implements FeeCalculator {
    @Override
    public int calculateFee() {
        return 10000;
    }
}
