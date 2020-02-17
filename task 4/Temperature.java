public class Temperature{
    public static void main(String[] args){
        int Fahrenheit[]=new int[5];
        Fahrenheit[0]=1;//initialization  
        Fahrenheit[1]=20;
        Fahrenheit[2]=40;
        Fahrenheit[3]=60;
        Fahrenheit[4]=80;
        
        for(int i=0; i<=Fahrenheit.length; i++){
            int Celsius = (((Fahrenheit[i] - 32)*5)/9);
            System.out.println(Fahrenheit[i] + " "+Celsius);
        }
      //  int Fahrenheit = 1;
         
    }
}