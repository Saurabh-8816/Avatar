public class Binomial_Coefficient {

     public static int factorial (int n) {

        int fact = 1; int i = 1;
         while (i<=n){
              fact = fact * i;
              i++;
         }
         return fact;
     }

    public static void main (String args[]){
          
        System.out.print(BinoCoefficient(5, 2));
    }

    public static int BinoCoefficient (int n, int r){

    // Note: n >= r >= 0

        int n_fact = factorial(n);
        int r_fact = factorial(r);

        int nCr_fact = factorial(n-r);

        int nmr = n_fact/ (r_fact * nCr_fact);

        return nmr;
    }
}