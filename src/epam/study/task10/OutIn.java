package epam.study.task10;

import java.util.Scanner;

public class OutIn {
	public static void Start10(){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter h: ");
        double h = in.nextDouble();
        
        while(a<=b) {
        	double fancion = Task10.outcome(a);
        	System.out.printf("%5.2f  ",a);
        	System.out.printf("%5.2f%n",fancion);
        	a+=h;
        }
        
	}
}