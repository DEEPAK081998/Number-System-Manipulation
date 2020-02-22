import java.util.*;

class addanybaseno{
    public static void main(String[]args) {
        Scanner s=new Scanner(System.in);
        System.out.print("\n Enter the base of the no's to be added : ");
        int b=s.nextInt();
        System.out.print("\n Enter the first number : ");
        int n1=s.nextInt();
        System.out.print("\n Enter the second number : ");
        int n2=s.nextInt();
        addanybaseno(b,n1,n2);   //function call
    }
        
   static void addanybaseno(int b,int n1, int n2){
        int carry=0;
        int sum=0;
        int pow=1;

        while(n1!=0||n2!=0||carry!=0){
            int d1=n1%10;  //getting the right most digit.
            int d2=n2%10;  //getting the right most digit.
            
            if(d1+d2+carry>=b){
                sum=((d1+d2+carry)%b)*pow+sum;
                carry=1;
            }
            else{
                sum=((d1+d2+carry)%b)*pow+sum;
                carry=0;
            }
            pow*=10; // 'pow' is a helper to generate the resultant number(sum)
            n1/=10;  //to get the next digit
            n2/=10;  //to get the next digit
        }
        System.out.print("\n The sum of the numbers is : "+sum);
    }
    }
