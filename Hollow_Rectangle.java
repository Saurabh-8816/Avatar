public class Hollow_Rectangle {
    public static void main(String args[]){
        
        diagram(5,6);
    }

    public static void diagram(int totalRow, int totalCol){

        //outer loop
        for(int i=1; i<=totalRow; i++){
            // inner loop
            for(int j=1; j<=totalCol; j++){
                //cell - (i,j)
                if(i==1 || i == totalRow || j == 1 || j == totalCol){
                    // boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
}

/*

******
*    *
*    *
*    *
******

*/