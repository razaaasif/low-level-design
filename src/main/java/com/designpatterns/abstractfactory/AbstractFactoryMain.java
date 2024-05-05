package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.interfaces.AdmitCard;
import com.designpatterns.abstractfactory.interfaces.FeeCalculator;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        UniversityFactory universityFactory = UniversityFactory.getUniversityFactory(100);

        AdmitCard admitCard1 = universityFactory.getAdmitCard("CS");
        FeeCalculator feeCalculator = universityFactory.getFeeCalculator("CS");
        System.out.println(admitCard1);
        System.out.println(feeCalculator.calculateFee());

        AdmitCard admitCard2 = universityFactory.getAdmitCard("Math");
        FeeCalculator feeCalculator2 = universityFactory.getFeeCalculator("Math");
        System.out.println(admitCard2);
        System.out.println(feeCalculator2.calculateFee());

        UniversityFactory universityFactory2 = UniversityFactory.getUniversityFactory(150);
        AdmitCard admitCard3 = universityFactory2.getAdmitCard("CS");
        FeeCalculator feeCalculator3 = universityFactory2.getFeeCalculator("CS");
        System.out.println(admitCard3);
        System.out.println(feeCalculator3.calculateFee());

    }
}
