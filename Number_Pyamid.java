public class Number_Pyamid{
    public static void main(String args[]){

        numPyramid(7);
    }

    public static void numPyramid(int num){

        for(int i = 1; i<=num; i++){
           for(int space = 1; space<=(num-i); space++)
           {
            System.out.print(" ");
           }
           for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
           }
           System.out.println();
        }
    }
} 

/*

      1 
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5
 6 6 6 6 6 6 
7 7 7 7 7 7 7

*/