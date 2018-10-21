package nl.frisodobber.java9.jigsaw.calculator.algorithm.add.extension;

import nl.frisodobber.java9.jigsaw.calculator.algorithm.api.Algorithm;

/**
 * @author tiny.wang
 */
public class AddTwice implements Algorithm {

    @Override
    public Integer calculate(Integer input, Integer input2) {
        return 2 * (input + input2);
    }
}
