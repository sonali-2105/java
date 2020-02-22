public class Sum_Prime{
    public static void main(String[] args){
        
        int i, num, count, sum=0;
        for(num=1; num<=30; num++)
        {
            count=0;
            for(i=2; i<=num/2; i++)
            {
                if(num% i == 0)
                {
                    count++;
                    break;

                }
            }
            if(count==0 && num!=1)
            {
                sum = sum + num;
            }
        }
        System.out.println("\n The sum of first ten prime numbers= "+sum);
    }
}
