package com.designpatterns.abstractfactorypattern.interfacesImp.modernfurniture;

import com.designpatterns.abstractfactorypattern.interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern chair");
    }
}
