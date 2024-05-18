package com.designpatterns.abstractfactorypattern;

import com.designpatterns.abstractfactorypattern.factoryinterfaces.AbstractFurnitureFactory;
import com.designpatterns.abstractfactorypattern.factoryinterfaces.FurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = AbstractFurnitureFactory.createFurniture("modern");
        furnitureFactory.createChair().sitOn();
        furnitureFactory.createSofa().sitOnSofa();
        furnitureFactory.createCoffeeTable().putCoffee();
    }
}
