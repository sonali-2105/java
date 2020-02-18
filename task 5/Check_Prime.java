import java.util.Scanner;
public class Check_Prime{
     public static void main(String[] args){
        Scanner s =new Scanner(System.in);
         System.out.print("Enter a number : ");
        int num=s.nextInt();
         if(num%2==0){
            System.out.print("Entered number is not a prime number");
        }else{
            for(int i=2; i<=num; i++){
                if(num%i==0){
                    System.out.println("Entered number is a prime number");
                }
            }

            
        }
    }
}
