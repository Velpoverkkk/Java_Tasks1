package epam.study.task5;

import java.util.Scanner;

public class OutIn {
	public static void Start5(){
		
		Scanner in = new Scanner(System.in);
        System.out.print("Enter value: ");
        int inputValue = in.nextInt();
        boolean answer = Task5.outcome(inputValue);
        if(answer) System.out.println("true");
        else System.out.println("false");
        
	}
}