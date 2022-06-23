package us.odden.evolution;

import us.odden.evolution.brain.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double i = -10.0;
        while (i < 10.0) {
            System.out.println(Function.TANH_DER.apply(i));
            i += .1;
        }
    }
}