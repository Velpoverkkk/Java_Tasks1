package epam.study.task6;

import epam.study.task6.OutIn;

public class Task6 {
	public static void main(String[] args) {
		OutIn.Start6();
	}
	public static void outcome(double t) {
		double h,m,s;
		h=t/3600;
		m=h;
		h=Math.floor(h);
		m=(m-h)*60;
		s=m;
		m=Math.floor(m);
		s=(s-m)*60;
		s=Math.floor(s);
		System.out.print(h+"  H  "+m+"  M  "+s+"  S  ");
	}
}