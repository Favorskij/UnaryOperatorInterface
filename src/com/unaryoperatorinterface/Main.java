package com.unaryoperatorinterface;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        UnaryOperator<Integer> square = x -> x*x;

        System.out.println(square.apply(5)); // 25

    }
}
