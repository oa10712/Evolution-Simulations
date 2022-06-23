package us.odden.evolution.body;

import us.odden.evolution.brain.Brain;

import java.util.LinkedList;

public class Body {

    private Brain brain;

    private Organ[] organs;

    private double[] color;
    private double mass;
    private double direction;
    private double[] location;
    private double age;
    private double health;
    private double energy;
    private double mutationRate;

    public void tick() {
        age += .000001;
        Double[] senses = gatherSenses();
        LinkedList<Double> processed = brain.process(senses);
        act(processed);
    }

    private Double[] gatherSenses() {
        int size = 0;
        for (Organ organ : organs) {
            size += organ.sensorCount();
        }
        Double[] doubles = new Double[size];
        int index = 0;
        for (Organ organ : organs) {
            for (double sense : organ.getSenses()) {
                doubles[index] = sense;
                index++;
            }
        }
        return doubles;
    }

    private void act(LinkedList<Double> processed) {
        for (Organ organ : organs) {
            organ.act(processed);
        }
    }
}
