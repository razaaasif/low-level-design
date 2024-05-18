package com.designpatterns.abstractfactorypattern.interfacesImp.modernfurniture;

import com.designpatterns.abstractfactorypattern.interfaces.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Putting tea on Modern Coffetable");
    }
}
