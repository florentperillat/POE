package com.java.tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FonctionalMain {
    // le fonctionnel c'est
    // f(x) = x + 1 avec x € R

    public static void main (String[] args) {
        Function<Double, Double> f = x-> x + 1;
        System.out.println(f.apply(1.0));
        Function<Double, Boolean> predicat = x -> x<10;

        ArrayList<Double> l = new ArrayList( Arrays.asList (2.0, 42.0, 72.0, 8.0));
        //le fonctionnel permet d'éviter de faire des boucles
        List<Double> res = new ArrayList();

        res =  l.stream().filter (x -> x<10.0).collect(Collectors.toList());

        Stream<Double> stream = l.stream().filter(x->x<10);
        stream = l.stream().filter(x->x<10).filter(x->x>2);

        res = stream.collect(Collectors.toList()); // lazy loading

        stream = l.stream().map(x->x+1);
        stream = l.stream().map(x->Math.cos(x));
        stream = l.stream().map(x->Math.cos(x)).filter(x->x<0.5);

        Stream<Boolean> stream2 = l.stream().map(x->x<10);
        System.out.println(stream2.collect(Collectors.toList()));
    }
}
