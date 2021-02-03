package epam.study.task4;

import java.util.Scanner;

public class OutIn {
	public static void Start4(){
		
		Scanner in = new Scanner(System.in);
        System.out.print("Enter A B C D: \n");
        int[] ABCD = new int[4];
        for(int i=0;i<4;i++) {
        	ABCD[i]= in.nextInt();
        }
        boolean answer = Task4.outcome(ABCD);
        if(answer) System.out.println("true");
        else System.out.println("false");
	}
}