import java.util.*;

class onebase2anybase{
    public static void main(String [] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("\n Enter the base of the number : ");
        int b1=s.nextInt();
        System.out.print("\n Enter the number : ");
        int n=s.nextInt();
        System.out.print("\n Enter the base of the number to be converted to : ");
        int b2=s.nextInt();
        ConvFromB1toB2(n,b1,b2);
    }

    static int ConvtoDec(int n , int b){   //converts number into Decimal
        int pow=0;
        int num=0;
        while(n!=0){
            int digit=n%10;
            num=num+digit*(int)Math.pow(b,pow);
            pow+=1;
            n/=10;
        }
        return num;
    }

    static int DectoGivenBase(int n, int b){    //converts decimal into the desired base
        int pow=1;
        int num=0;
        while(n!=0){
            int rem=n%b;
            num=rem*pow+num;
            n=n/b;
            pow=pow*10;
        }
        return num;
    }

    static void ConvFromB1toB2(int n,int b1,int b2){    //converts from base1 to base2 using above functions
        int dec=ConvtoDec(n,b1);
        int result=DectoGivenBase(dec,b2);      //the number passed here will be the decimal number generated from above function
        System.out.print("\n The number in the desired base is : "+result+"\n");   
    }
}