package com.designpatterns.abstractfactorypattern.interfacesImp.modernfurniture;

import com.designpatterns.abstractfactorypattern.interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void sitOnSofa() {
        System.out.println("Sitting on Modern Sofa");
    }
}
