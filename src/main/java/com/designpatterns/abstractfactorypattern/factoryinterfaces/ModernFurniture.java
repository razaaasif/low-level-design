package com.designpatterns.abstractfactorypattern.factoryinterfaces;

import com.designpatterns.abstractfactorypattern.interfaces.Chair;
import com.designpatterns.abstractfactorypattern.interfaces.CoffeeTable;
import com.designpatterns.abstractfactorypattern.interfaces.Sofa;
import com.designpatterns.abstractfactorypattern.interfacesImp.modernfurniture.ModernChair;
import com.designpatterns.abstractfactorypattern.interfacesImp.modernfurniture.ModernCoffeeTable;
import com.designpatterns.abstractfactorypattern.interfacesImp.modernfurniture.ModernSofa;

public class ModernFurniture implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
