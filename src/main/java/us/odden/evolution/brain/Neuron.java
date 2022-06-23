package us.odden.evolution.brain;

public class Neuron {

    double[] weights;
    final Function function;

    public Neuron(double[] weights, Function function) {
        this.weights = weights;
        this.function = function;
    }

    public Double process(Double[] inputs) {
        double sum = 0;
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i] * weights[i];
        }
        return function.apply(sum);
    }

    public Double createPaths(Double[] inputs) {
        if (inputs.length > weights.length) {
            double[] temp = new double[inputs.length];
            int i = 0;
            for (; i < weights.length; i++) {
                temp[i] = weights[i];
            }
            while (i < inputs.length) {
                temp[i] = 0.0;
                i++;
            }
            weights = temp;
        }
        return 0.0;
    }
}
