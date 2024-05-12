package com.designpatterns.factorypattern;

public class ShipTransport implements  Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering goods via see routes.");
    }
}
