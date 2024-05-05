package com.designpatterns.abstractfactory.feecalculator;

import com.designpatterns.abstractfactory.interfaces.FeeCalculator;

public class IITDelhiFeeCalculator implements FeeCalculator {
    @Override
    public int calculateFee() {
        return 1000;
    }
}
