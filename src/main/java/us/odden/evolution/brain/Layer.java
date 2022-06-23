package us.odden.evolution.brain;

public class Layer {
    final Neuron[] array;

    public Layer(Neuron[] array) {
        this.array = array;
    }

    public Double[] process(Double[] inputs) {
        Double[] outputs = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            outputs[i] = array[i].process(inputs);
        }
        return outputs;
    }

    public Double[] createPaths(Double[] inputs) {
        Double[] outputs = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            outputs[i] = array[i].createPaths(inputs);
        }
        return outputs;
    }
}
