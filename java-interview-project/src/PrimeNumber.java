import  java.util.*;

public class PrimeNumber {

    public static void main(String args[]){
        //create a scanner class object
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter Your number" );
        a=sc.nextInt();
        
        if(a%2==0){
            System.out.println("Your Enter Number is Prime ");
        }else{
            System.out.println("Your Enter Number Not a Prime");
        }
    }
    
}
