package com.company;

public class Triangle {
    double a;
    double b;
    double c;

     void area () {
        double v = (a + b + c)/2;
        System.out.println(" Уч бурчтуктун аянты: " + Math.sqrt(v * (v - a) * (v - b) * (v - c)));
    }
}
