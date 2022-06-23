package us.odden.evolution.brain;

import java.util.Collections;
import java.util.LinkedList;

public class Brain {
    Layer[] layers;

    public void createPaths(Double[] inputs) {
        Double[] next = inputs;
        for (Layer layer : layers) {
            next = layer.createPaths(next);
        }
    }

    public LinkedList<Double> process(Double[] inputs) {
        Double[] next = inputs;
        for (Layer layer : layers) {
            next = layer.process(next);
        }
        LinkedList<Double> list = new LinkedList<>();
        Collections.addAll(list, next);
        return list;
    }
}
