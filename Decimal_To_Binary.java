public class Decimal_To_Binary {
    
    public static int pow (int base, int pow){

        int result = base;
        if(pow==0){
            return 1;
        }

        if(pow==1){
            return base;
        }

        for(int i = 2; i<=pow; i++){
            
            result = result * base;
        }
        return result;
    }

    public static int DecToBin(int n){

         int rem = 0, binary = 0, i=0;
        while(n>0){
            
            rem = n % 2;
            bin = bin + (rem * pow(10,i));
            i++;
            n = n/2;
        }
        return bin;
    }

    public static void main (String args[]){
 
           int binary = 15;
        System.out.print("Binary of "+ binary + " = " + DecToBin(binary) );
    }
}