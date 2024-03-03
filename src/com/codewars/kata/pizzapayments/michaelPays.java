package com.codewars.kata.pizzapayments;

public class michaelPays {
    static double michaelPays(double cost) {
        return (cost < 5 ? Math.round(cost * 100.0) / 100.0 : cost >= 30 ? Math.round((cost - 10.0) * 100.0) / 100.0 : Math.round((cost - cost / 3.0) * 100.0) / 100.0);
    }
}
