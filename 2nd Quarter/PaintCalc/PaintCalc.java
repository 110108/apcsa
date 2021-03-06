import java.util.Scanner;

public class PaintCalc
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double l;
		double w;
		double h;
		double ttl;
		int totl=0;
		int galNum = 0;
		int quartNum = 0;
		int win;
		int door;
		final int GALLON_COVERAGE = 300;
		final int QUART_COVERAGE = 75;
		final int DEFAULT = 1;

		//entering dimentions
		System.out.print("Enter the room dimentions below:\nLength: ");
		l=sc.nextDouble();
		System.out.print("Width: ");
		w=sc.nextDouble();
		System.out.print("Height: ");
		h=sc.nextDouble();
		System.out.print("\nHow many doors does the room have? ");
		door=sc.nextInt();
		System.out.print("How many windows does the room have? ");
		win=sc.nextInt();

		//MATH
		ttl=(l*h)*2;
		ttl+=(w*h)*2;
		ttl-=((win*12)+(door*21));
		if(ttl<0)
		{
			System.out.println("\nNo paint needed or Room not possible\n");
			System.exit(0);
		}

		//printing total area
		System.out.println("\n\nTotal square feet: "+ttl+" ft");

		//MORE MATH
		if(ttl/GALLON_COVERAGE==0)
		{
			if(ttl/QUART_COVERAGE==0)
			{
				quartNum = DEFAULT;
			}
			if(ttl/QUART_COVERAGE>=0)
			{
				totl = (int)Math.ceil(ttl);
				quartNum = totl/QUART_COVERAGE;
				ttl-=(quartNum*QUART_COVERAGE);
			}
		}
		if(Math.ceil(ttl)/GALLON_COVERAGE>0)
		{
			totl = (int)Math.ceil(ttl);
			galNum = (totl/GALLON_COVERAGE);
			ttl-=(galNum*GALLON_COVERAGE);
			quartNum = (int)ttl/QUART_COVERAGE;
			ttl-=(quartNum*QUART_COVERAGE);
			if(ttl>0)
			{
				quartNum++;
			}
		}

		//final outs
		System.out.println("If gallons only: " + (galNum+1));
		System.out.println("If quarts are avalable: " + galNum + " Gallon(s) and " + quartNum + " Quart(s)");
	}
}
