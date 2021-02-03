package epam.study.task6;

import java.util.Scanner;

public class OutIn {
	public static void Start6(){
	
		Scanner in = new Scanner(System.in);
        System.out.print("Enter N second  : ");
        double t = in.nextDouble();
        Task6.outcome(t);
        
	}
}