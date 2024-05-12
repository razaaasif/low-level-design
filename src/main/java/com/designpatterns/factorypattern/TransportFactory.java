package com.designpatterns.factorypattern;

public class TransportFactory {

    public static Transport createTransport(String transport) {
            switch(transport){
                case "ship": return new ShipTransport();
                case "truck": return new TruckTransport();
                default: throw new IllegalArgumentException("Given transport type was not found");
            }
    }
}
