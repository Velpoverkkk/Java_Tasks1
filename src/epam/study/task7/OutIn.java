package epam.study.task7;

import java.util.Scanner;

public class OutIn {
	public static void Start7(){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x1,y1 : ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("Enter x1,y1 : ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double a = Task7.outcome1(x1,y1);
        double b = Task7.outcome2(x2,y2);
        if(a<b) System.out.println("A blize");
        else if(a>b) System.out.println("B blize");
        else System.out.print("odinakovo");
	}
}