package com.designpatterns.abstractfactorypattern.interfacesImp.victorianfurniture;

import com.designpatterns.abstractfactorypattern.interfaces.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Victorian Chair");
    }
}
