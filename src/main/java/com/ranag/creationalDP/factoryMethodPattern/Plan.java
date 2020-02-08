package com.ranag.creationalDP.factoryMethodPattern;

abstract class Plan {
    protected int rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }

}
