package com.designpatterns.abstractfactory.factoryclasses;

import com.designpatterns.abstractfactory.UniversityFactory;
import com.designpatterns.abstractfactory.admitscards.*;
import com.designpatterns.abstractfactory.feecalculator.*;
import com.designpatterns.abstractfactory.interfaces.AdmitCard;
import com.designpatterns.abstractfactory.interfaces.FeeCalculator;

public class PublicUniversity extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch(course){
            case "Math": return new IITMumbaiAdmitCard();
            case "Physics": return new IITDelhiAdmitCard();
            case "CS": return new IISCBangloreAdmitCard();
            default: return  null;
        }
    }

    @Override
    public FeeCalculator getFeeCalculator(String  course) {
        switch(course){
            case "Math": return new IITMumbaiFeeCalculator();
            case "Physics": return new IITDelhiFeeCalculator();
            case "CS": return new IISCBangloreFeeCalculator();
            default: return  null;
        }
    }
}
