package com.sfeir.bean;

import java.util.function.BiFunction;

/**
 * @author Yang Naihua
 * @description: MathOperation
 * @method
 * @date 2021-11-22 11:49:46
 */
public enum MathOperation {
    /**
     * Add
     */
    ADD(Integer::sum),
    /**
     * TODO
     */
    SUBSTRACT((integer, integer2) -> integer - integer2),
    /**
     * TODO
     */
    MULTIPLY((integer, integer2) -> integer * integer2),
    /**
     * TODO
     */
    DIVIDE((integer, integer2) -> integer / integer2);

    public BiFunction<Integer, Integer, Integer> getCompute() {
        return compute;
    }

    /**
     * @description:
     * @method BiFunction
     * @date 2021-11-22 12:08:54
     * @author Yang Naihua
     */
    private final BiFunction<Integer, Integer, Integer> compute;


    MathOperation(BiFunction<Integer, Integer, Integer> compute) {
        this.compute = compute;
    }
}
