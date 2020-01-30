import java.util.Scanner;

public class CalculatorProject {
	public static void main(final String args[]) {
		System.out.println("My First Calculator Program");
		System.out.println("===========================");
		System.out.println("Enter Two  Number for Basic Airthmetic opertaion");
		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        pavan
		
=======
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		pow(a, b);
>>>>>>> 11f3dfc2a68c2d566e0207001e9245ed6ffb7a61
	}

	public static void pow(final int a, final int b)
	{
		final int p = (int) Math.pow((double)a, (double)b);
		System.out.println("Result : "+p);
	}
}