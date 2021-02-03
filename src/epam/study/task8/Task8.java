package epam.study.task8;

import epam.study.task8.OutIn;

public class Task8 {
	public static void main(String[] args) {
		OutIn.Start8();
	}
	public static double outcome(double x) {
		double y;
        if(x>=3) {
        	y=-1*Math.pow(x,2)+3*x+9;
        }
        else {
        	y=Math.pow((Math.pow(x,3)-6),-1);
        }
		return y;
	}
}