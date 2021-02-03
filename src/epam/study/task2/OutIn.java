package epam.study.task2;

import java.util.Scanner;

public class OutIn {
	public static void Start2(){
		
		Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        System.out.print("Enter month  : ");
        int month = in.nextInt();
        int result = Task2.outcome(year, month);
        System.out.println("Day in Month"+result);
        
	}
}
