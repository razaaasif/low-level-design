package com.designpatterns.abstractfactory.factoryclasses;

import com.designpatterns.abstractfactory.UniversityFactory;
import com.designpatterns.abstractfactory.admitscards.CalTechAdmitCard;
import com.designpatterns.abstractfactory.admitscards.GeorgiaTechAdmitCard;
import com.designpatterns.abstractfactory.admitscards.MITAdmitCard;
import com.designpatterns.abstractfactory.feecalculator.CalTechFeeCalculator;
import com.designpatterns.abstractfactory.feecalculator.GeorgiaTechFeeCalculator;
import com.designpatterns.abstractfactory.feecalculator.MITFeeCalculator;
import com.designpatterns.abstractfactory.interfaces.AdmitCard;
import com.designpatterns.abstractfactory.interfaces.FeeCalculator;

public class IvyLeagueUniversityFactory extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch(course){
            case "Math": return new MITAdmitCard();
            case "Physics": return new CalTechAdmitCard();
            case "CS": return new GeorgiaTechAdmitCard();
            default: return  null;
        }
    }

    @Override
    public FeeCalculator getFeeCalculator(String  course) {
        switch(course){
            case "Math": return new MITFeeCalculator();
            case "Physics": return new CalTechFeeCalculator();
            case "CS": return new GeorgiaTechFeeCalculator();
            default: return  null;
        }
    }
}
