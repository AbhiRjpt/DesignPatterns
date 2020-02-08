package com.ranag.creationalDP.factoryMethodPattern;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        System.out.println("planType---:"+planType);
        if(planType == null){
            return null;
        }

        if(planType.equalsIgnoreCase("DomesticPlan")){
            return new DomesticPlan();
        }

        if(planType.equalsIgnoreCase("ComPlan")){
            return new ComPlan();
        }

        if(planType.equalsIgnoreCase("InstPlan")){
            return new InstPlan();
        }

        return null;
    }
}
