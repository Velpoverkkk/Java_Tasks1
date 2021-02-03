package epam.study.task1;

import java.util.Scanner;

public class OutIn {
	public static void Start1(){
	
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Please, input any number: ");
    int inputNumber = inputScanner.nextInt();
    int result = Task1.outcome(inputNumber);
    System.out.println("Result is: " + result);

	}
}
