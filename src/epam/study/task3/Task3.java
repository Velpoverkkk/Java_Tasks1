package epam.study.task3;

import epam.study.task3.OutIn;

public class Task3 {
	public static void main(String[] args) {
		OutIn.Start3();
	}
	
	public static double outcome(double s1) {
		double s2,r,raznica;
        r=Math.sqrt(s1)/2.;
        s2=2*r*r;
        raznica=Math.round(s1/s2); 
		return raznica;
	}
}
