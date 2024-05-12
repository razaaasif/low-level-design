package com.designpatterns.factorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Transport ship = TransportFactory.createTransport("ship");
        Transport truck = TransportFactory.createTransport("truck");
        ship.deliver();
        truck.deliver();
    }
}
