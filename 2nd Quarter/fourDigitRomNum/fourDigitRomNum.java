import java.util.Scanner;

public class fourDigitRomNum
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      String rom = "";
      int num;

      System.out.print("Please enter a number between 0 and 4000: ");
      num = sc.nextInt();

      if(num>=4000||num<=0){
		  System.out.println("\nNumber out of range\n");
		  System.exit(0);
	  }

      do{
        if(num>=1000){
          num-=1000;
          rom+="M";
          continue;
	  }
        if(num>=500){
          num-=500;
          rom+="D";
          continue;
        }
        if(num>=100){
          num-=100;
          rom+="C";
          continue;
        }
        if(num>=50){
          num-=50;
          rom+="L";
          continue;
        }
        if(num>=10){
          num-=10;
          rom+="X";
          continue;
        }
         if(num>=9){
			 num-=9;
			 rom+="IX";
			 continue;
        }
        if(num>=5){
          num-=5;
          rom+="V";
          continue;
        }
         if(num>=4){
           num-=4;
           rom+="IV";
           continue;
        }
        if(num>=1){
          num-=1;
          rom+="I";
          continue;
        }
      }while(num > 0);
      System.out.println(rom);
   }
}
