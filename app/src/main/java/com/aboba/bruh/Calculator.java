package com.aboba.bruh;

public class Calculator {
    double money;
    double plus;
    double interest;
    double goal;

    public Calculator(){}
    public Calculator(double money, double plus, double interest, double goal){
        this.money=money;
        this.plus=plus;
        this.interest=interest;
        this.goal=goal;
    }
    private double iterate(double money, double plus, double interest){
        return money*((interest/12/100))+plus;
    }
    public int calculate(){
        int months=0;
        while(money<goal){
            this.money+=iterate(money, plus, interest);
            months++;
        }
        return months;
    }
}
