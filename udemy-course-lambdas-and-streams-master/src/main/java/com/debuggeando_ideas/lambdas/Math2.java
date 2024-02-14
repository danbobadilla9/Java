package com.debuggeando_ideas.lambdas;

@FunctionalInterface
public interface Math2 {

    Double execute(Double a, Double b);

    default Double sum(Double a, Double b){return a + b;}
}
