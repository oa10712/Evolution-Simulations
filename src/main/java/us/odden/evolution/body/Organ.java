package us.odden.evolution.body;

import java.util.LinkedList;

public abstract class Organ {
    public abstract int sensorCount();

    public abstract double[] getSenses();

    public abstract void act(LinkedList<Double> processed);
}
