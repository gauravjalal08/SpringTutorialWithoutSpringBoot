package com.example;

public class SuryaBulb implements  Bulb{

   // SuryaBulb suryaBulb = new SuryaBulb(); not recommended(Tightly coupled)
    Bulb bulb = new SuryaBulb(); // loosely coupled child class object -> interface reference

    @Override
    public String getBulb(){
        return bulb.getBulb();
    }
}
