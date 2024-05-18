package com.designpatterns.abstractfactorypattern.factoryinterfaces;

import com.designpatterns.abstractfactorypattern.interfaces.Chair;
import com.designpatterns.abstractfactorypattern.interfaces.CoffeeTable;
import com.designpatterns.abstractfactorypattern.interfaces.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
