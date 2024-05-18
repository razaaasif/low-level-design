package com.designpatterns.abstractfactorypattern.interfacesImp.victorianfurniture;

import com.designpatterns.abstractfactorypattern.interfaces.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Victorian Coffee table");
    }
}
