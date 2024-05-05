package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.factoryclasses.IvyLeagueUniversityFactory;
import com.designpatterns.abstractfactory.factoryclasses.PublicUniversity;
import com.designpatterns.abstractfactory.interfaces.AdmitCard;
import com.designpatterns.abstractfactory.interfaces.FeeCalculator;

public abstract class UniversityFactory {
    private final static int CUT_OFF = 100;
    public static UniversityFactory getUniversityFactory(int cutoff){
        return cutoff > CUT_OFF ?  new IvyLeagueUniversityFactory()
                : new PublicUniversity();
    }

    public abstract AdmitCard getAdmitCard(String course);
    public abstract FeeCalculator getFeeCalculator(String course);
}
