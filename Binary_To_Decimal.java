public class Binary_To_Decimal{
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

    public static int BintoDec(int BinNum){
          
          int decimal = 0;
          int i = 0;
          while(BinNum>0){

            int last_digit = BinNum % 10;
            decimal = decimal + (last_digit * pow(2,i));
            BinNum = BinNum /10;
            i++;
          }
          return decimal;
    }

    public static void main (String args[]){

          int bit = 101;
        System.out.print("decimal of " + bit + " = " + BintoDec(101));
    }
}

