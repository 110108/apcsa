import java.util.Scanner;

public class PaintCalc
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double l;
		double w;
		double h;
		int win;
		int door;
		double ttl;

		//entering dimentions
		System.out.print("Enter the room dimentions below:\nLength: ");
		l=sc.nextDouble();
		System.out.print("Width: ");
		w=sc.nextDouble();
		System.out.print("Width: ");
		h=sc.nextDouble();
		System.out.print("\nHow many doors does the room have? ");
		door=sc.nextInt();
		System.out.print("How many windows does the room have? ");
		win=sc.nextInt();

		//ALL THE MATH
		ttl=(l*h)*2;
		ttl+=(w*h)*2;
		ttl-=((win*12)+(door*21));
		System.out.print(ttl);

		//final println
		System.out.println("\nTotal square feet: "+
	}
}

