public class Temperature{
    public static void main(String[] args){
        int Fahrenheit[]=new int[16];
        Fahrenheit[0]=1;//initialization  
        Fahrenheit[1]=20;
        Fahrenheit[2]=40;
        Fahrenheit[3]=60;
        Fahrenheit[4]=80;
        Fahrenheit[5]=100;
        Fahrenheit[6]=120;
        Fahrenheit[7]=140;
        Fahrenheit[8]=160;
        Fahrenheit[9]=180;
        Fahrenheit[10]=200;
        Fahrenheit[11]=220;
        Fahrenheit[12]=240;
        Fahrenheit[13]=260;
        Fahrenheit[14]=280;
        Fahrenheit[15]=300;

        
        for(int i=0; i<=Fahrenheit.length; i++){
            int Celsius = (((Fahrenheit[i] - 32)*5)/9);
            System.out.println(Fahrenheit[i] + " "+Celsius);
        }
      //  int Fahrenheit = 1;
         
    }
}