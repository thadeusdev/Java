import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		double x = 3.14;
		double y = -10;
		double t = 10;
		
		double z = Math.min(x, y);
		double a = Math.abs(y);
		double b = Math.sqrt(t);
		double c = Math.round(x);
		double d = Math.ceil(x);
		double e = Math.floor(x);
		
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		*/
		
		// calculate the hypotenuse
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x) + (y*y));
		
		System.out.println("The hypothenuse is: " + z);
		
		scanner.close();
		
	}

}
