package us.odden.evolution.brain;

public enum Function {
    RELU(input -> {
        if (input < 0) return -1.0;
        else return 1.0;
    }),
    SIGMOID(input -> 1.0 / (1 + Math.pow(Math.E, (-input)))),
    SIGMOID_DER(input -> (Math.pow(Math.E, (-input))) / Math.pow(Math.pow(Math.E, (-input)) + 1, 2)),
    TANH(input -> (1.0 - Math.pow(Math.E, (-2 * input))) / (1.0 + Math.pow(Math.E, (-2 * input)))),
    TANH_DER(input -> 1.0 - Math.pow(TANH.apply(input),2.0));

    private java.util.function.Function<Double, Double> algorithm;

    Function(java.util.function.Function<Double, Double> algorithm) {
        this.algorithm = algorithm;
    }

    public double apply(double input) {
        return algorithm.apply(input);
    }
}
