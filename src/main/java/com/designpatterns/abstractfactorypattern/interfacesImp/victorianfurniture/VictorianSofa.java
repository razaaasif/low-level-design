package com.designpatterns.abstractfactorypattern.interfacesImp.victorianfurniture;

import com.designpatterns.abstractfactorypattern.interfaces.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void sitOnSofa() {
        System.out.println("Victorian Sofa");
    }
}
