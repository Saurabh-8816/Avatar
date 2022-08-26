public class Butterfly {
    public static void main (String args[]){

          butterfly(4);
    }

    public static void butterfly (int num){
       
       //outer loop
        for(int i = 1; i<= num; i++){
            //stars
            for( int j = 1; j<= i; j++ ){
               
               System.out.print("*");
            }
             // spaces : 2 * (n-i)   || Where max spaces occured when : 2*(n-1) here i = 1
            for (int space =1; space<=(2*(num-i)); space++){

                System.out.print(" ");
            }

            //stars
            for (int k =1; k<=i; k++){

                System.out.print("*");
            }
            System.out.println();
        }

          for(int i = num; i>=1; i--){
             for( int j = 1; j<= i; j++ ){
               
               System.out.print("*");
            }

            for (int j =1; j<=(2*(num-i)); j++){

                System.out.print(" ");
            }

            for (int j =1; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

/*

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
    
*/
