package com.java.tp;
import java.util.*;

public class Collections {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, 0);
        list.add(1, 1);
        list.add(2, 2);
        list.add(3, 3);
        list.remove(2);
        for (Integer i :list) {
            System.out.println(i);
        }

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Sum List = " + sumList(list2));
        System.out.println("Max List = " + maxList(list2));
        System.out.println("Min List = " + minList(list2));
        System.out.println("Moy List = " + moyList(list2));
        System.out.println("Prime numbers : ");
        afficheList(getPrimeNumbList(list2));
        System.out.println("Inverted list : ");
        afficheList(inverseWithoutList(list2));

   // TP     Fonctions Somme, Min, Max, Moyenne, getPrimeNumbers, inverse, refaire inverse sans créer une nouvelle liste
}

    public static void afficheList (ArrayList<Integer> list) {
        for (Integer i:list){
            System.out.println(i);
        }
    }

    public static int sumList(ArrayList<Integer> list) {
        int res = 0;
        for (Integer i :list) {
            res += i.intValue();
        }
        return res;
    }

    public static int minList(ArrayList<Integer> list) {
        int min = list.get(0).intValue();
        for (int i :list) {
            if (i<min) {
                min = i;
            }
        }
        return min;
    }
    public static int maxList(ArrayList<Integer> list) {
        int max = list.get(0).intValue();
        for (int i :list) {
            if (i>max) {
                max = i;
            }
        }
        return max;
    }
    public static double moyList(ArrayList<Integer> list) {
        double moy = (double)sumList(list)/list.size();
        return moy;
    }

    public static ArrayList<Integer> getPrimeNumbList(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean prime = true;
        for (Integer i:list){
            for (int j = 2; j<(i^1/2); j++) {
                if (i%j==0||i==1) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                result.add(i);
            }
            prime = true;
        }
        return result;
    }


        public static ArrayList<Integer> inverse(ArrayList<Integer> list) {
            ArrayList<Integer> result = new ArrayList<>();
            for(int i = list.size() -1; i>=0; i--){
                result.add(list.get(i));
            }
            return result;
        }

        public static ArrayList<Integer> inverseWithoutList(ArrayList<Integer> list) {
        for(int i = list.size() -2; i>0; i--){
            list.add(i);
            list.remove(i);
        }
        return list;
    }


}
