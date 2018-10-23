import java.util.Scanner;

public class telephoneNum
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String num;
		String areaCode;
		String first3Nums;
		String last4Nums;

		System.out.print("Please enter ten(10) digit phone number: ");
		num=sc.next();

		areaCode = num.substring(0,3);
		first3Nums = num.substring(3,6);
		last4Nums = num.substring(6,10);

		System.out.println("("+areaCode+")"+first3Nums+"-"+last4Nums);
	}
}

