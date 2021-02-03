package epam.study.task8;

import java.util.Scanner;

public class OutIn {
	public static void Start8(){
		Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        double result = Task8.outcome(x);
        System.out.print("Funtion = "+result);
	}
}