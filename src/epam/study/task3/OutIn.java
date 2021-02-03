package epam.study.task3;

import java.util.Scanner;

public class OutIn {
	public static void Start3(){
		
		Scanner in = new Scanner(System.in);
        System.out.print("Enter S: ");
        double s1 = in.nextDouble();
        double result = Task3.outcome(s1);
        System.out.println("S2 = "+result);
        
	}
}
