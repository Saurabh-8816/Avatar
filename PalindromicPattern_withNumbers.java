public class PalindromicPattern_withNumbers {
    public static void main(String args[]){

         Palpattern(5);
    }

    public static void Palpattern (int num){

        for(int i = 1; i<=num; i++){
            // spaces
            for(int space = 1; space<=(num - i); space++)
            {
                System.out.print(" ");
            }
            // Descending
            for(int j = i; j>=1; j--)
            {
                System.out.print(j);
            }
             // Ascending
            for(int k = 2; k<=i; k++)
            {
                  System.out.print(k);
            }

            System.out.println();
        }
    }
}

/*

    1
   212
  32123
 4321234
543212345

*/