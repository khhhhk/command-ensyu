public class Main{
	public static void main(String[] args){
		System.out.print("g’·:");
		double s = new java.util.Scanner(System.in).nextInt();
		System.out.print("‘Ìd:");
		double t = new java.util.Scanner(System.in).nextInt();

		double h = s/100.0;

		double bmi = t/(h*h);
		double b = ((double)Math.round(bmi * 100))/100;
		System.out.print(b);
	}
}

