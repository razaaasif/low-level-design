package com.designpatterns.factorypattern;

public class TruckTransport implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering goods via road.");
    }
}
