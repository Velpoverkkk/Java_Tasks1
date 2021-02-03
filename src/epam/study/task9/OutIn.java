package epam.study.task9;

import java.util.Scanner;

public class OutIn {
	public static void Start9(){
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите R: ");
        double r = in.nextDouble();
		final double Pi = 3.1415926536;
		double l = Task9.calculateLenght(r,Pi);
		double s = Task9.calcultateSquare(r,Pi);
		System.out.print("dlina = "+l+"\n"+"Ploscha = "+s);
	}
}