package com.designpatterns.abstractfactorypattern.factoryinterfaces;

public abstract class AbstractFurnitureFactory {
    public static FurnitureFactory createFurniture(String type){
        switch (type){
            case "modern" : return new ModernFurniture();
            case "victorian" : return new VictorianFurniture();
            default: throw new IllegalArgumentException("This type of furniture is not created here.");
        }
    }
}
