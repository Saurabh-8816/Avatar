import java.util.*;

public class Solid_Rhombus {
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);

        int num = sc.nextInt();

        solid_pattern(num);
    }

    public static void solid_pattern(int num){

        for(int i = 1; i<=num; i++){

            for(int space = 1; space<=(num-i); space++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j<=num; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

    *****
   *****
  *****
 *****
*****

*/