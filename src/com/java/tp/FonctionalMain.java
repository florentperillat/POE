package com.java.tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
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

        ArrayList<Double> l2 = new ArrayList( Arrays.asList (1.0, 2.0, 3.0, 4.0, 5.0, 11.0, 13.0, 19.0, 20.0, 22.0));
        List<Double> res2 = new ArrayList<>();

        stream = l2.stream().filter (x -> x%2==0);
        System.out.println(stream.collect(Collectors.toList()));
        stream = l2.stream().filter (x -> x%2==0).map(x -> Math.cos(x));
        System.out.println(stream.collect(Collectors.toList()));
        stream = l2.stream().filter (x -> isPrime(x.intValue()));
        System.out.println(stream.collect(Collectors.toList()));
        stream = l2.stream().filter (x -> isPrime(x.intValue())).map(x->Math.tan(x)).filter(x->x>0);
        System.out.println(stream.collect(Collectors.toList()));
        stream = l2.stream().filter (x -> x%2==0).map(x->Math.tan(x)).filter(x->x>0);
        System.out.println(stream.collect(Collectors.toList()));

        System.out.println(l2.stream().mapToDouble (x -> x).reduce(0, (x,y) -> x+y));
        //f(xy) = x+y avec x=0 et y incrément : 0+1=1; 1+2=3; 3+3=6; 6+4=10; 10+5=15; 15+6=21; 21+7=28...

    }

    public static boolean isPrime (int n) {
        boolean premier = true;
        for (int i = 2; i<(n^1/2); i++) {
            if (n%i==0) {
                    premier = false;
                    break;
                }
            }
            if (n==1) {
                premier = false;
            }
            return premier;
        }
}

// Créer une collection de 10 doubles
//filtrer les chiffres pairs
//filtrer les chiffres pairs+appliquer un cosinus
//filtrer les nombres premiers
//filtrer les nombres premiers + appliquer une tangente + filtrer les nombres positifs
