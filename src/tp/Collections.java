package tp;
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
        afficheList(getPrimeNumbList(list2));

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
        for (Integer i :list) {
            if (i.intValue()<min) {
                min = i.intValue();
            }
        }
        return min;
    }
    public static int maxList(ArrayList<Integer> list) {
        int max = list.get(0).intValue();
        for (Integer i :list) {
            if (i.intValue()>max) {
                max = i.intValue();
            }
        }
        return max;
    }
    public static int moyList(ArrayList<Integer> list) {
        int moy = sumList(list)/list.size();
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
}
