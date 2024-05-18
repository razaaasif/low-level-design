package com.designpatterns.abstractfactorypattern.factoryinterfaces;

import com.designpatterns.abstractfactorypattern.interfaces.Chair;
import com.designpatterns.abstractfactorypattern.interfaces.CoffeeTable;
import com.designpatterns.abstractfactorypattern.interfaces.Sofa;
import com.designpatterns.abstractfactorypattern.interfacesImp.victorianfurniture.VictorianChair;
import com.designpatterns.abstractfactorypattern.interfacesImp.victorianfurniture.VictorianCoffeeTable;
import com.designpatterns.abstractfactorypattern.interfacesImp.victorianfurniture.VictorianSofa;

public class VictorianFurniture implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
