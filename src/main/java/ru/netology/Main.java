package ru.netology;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        final String string = "Elen sila lumenn omentilmo, Lle quena i’lambe tel’ Eldalie?";
        Function<String, Stream<String>> stringStreamFunction =
                x -> Arrays.stream(x.replaceAll("\\p{Punct}", "").split("\\s+")).sorted();
        stringStreamFunction.apply(string).forEach(System.out::println);
    }
}
