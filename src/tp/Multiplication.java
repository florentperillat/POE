package tp;

public class Multiplication {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23};

        System.out.println(multiplier_recursif(tab, tab.length));

    }

/*    public static int[] multiply (int[] tab) {
        int[] tab2 = new int[tab.length-1];
        if(tab[0]!=0&&tab[1]!=0) {
            tab2[0]=tab[0]*tab[1];
        } else {
            tab2[0]=tab[0];
        }
        for(int i = 1; i<tab.length-1; i++) {
            tab2[i]=tab[i+1];
        }
        return multiply(tab2);
    }

	public static int mult(int[] tab) {
		int
	} */




    public static int factorielle(int n) {

        if (n==0 || n==1) {

            return 1;

        }

        else {

            int temp = n * factorielle(n - 1);

            return temp;

        }

    }



    public static int multiplier_classic(int[] tab) {

        int res = 1;

        for(int i:tab) {

            res *= i;

        }

        return res;

    }



    public static int multiplier_recursif(int[] tab, int n) {

        if (n == 1) {

            return tab[0];

        }

        else {

            return tab[n-1] * multiplier_recursif(tab, n-1);

        }

    }



    public static int sum_recursive(int[] tab, int n) {

        if (n == 1) {

            return tab[0];

        }

        else {

            return tab[n-1] + multiplier_recursif(tab, n-1);

        }

    }



    public static int max_recursive(int[] tab, int n) {

        if (n == 1) {

            return tab[0];

        }

        else {

            return tab[n-1] * multiplier_recursif(tab, n-1);

        }

    }

    public int min(int[] tab) {

        int res = tab[0];

        for(int i:tab) {

            if(i < res) {

                res = i;

            }

        }

        return res;

    }


}
