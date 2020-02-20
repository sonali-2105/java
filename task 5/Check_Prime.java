public class Check_Prime{
    
     public static void main(String[] args)
     {
         int i, count=0, num=179;
         
         
       // System.out.print("Enter a number : ");
         
         
         for(i=2; i<=num/2; i++)
         {
              if(num%i ==0)
              {
                  count++;
                  break;
              }
         }
         if(count ==0 && num!=1)
         {
             System.out.println(num + " is a Prime Number");
         }
         else
         {
             System.out.println(num + " is not a Prime Number");
         }

          
             
         
        
    }
}


