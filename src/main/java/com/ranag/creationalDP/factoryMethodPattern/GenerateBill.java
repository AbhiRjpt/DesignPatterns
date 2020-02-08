package com.ranag.creationalDP.factoryMethodPattern;

import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();
        Scanner sc = new Scanner(System.in);
        String planType = sc.nextLine();
        System.out.println("PlanType: "+planType);
        int units = sc.nextInt();
        System.out.println("units: "+units);
        Plan p = planFactory.getPlan(planType);
        System.out.print("Bill amount for "+planType+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);

    }
}
