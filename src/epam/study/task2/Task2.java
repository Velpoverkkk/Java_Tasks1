package epam.study.task2;


import epam.studyc.task2.OutIn;

public class Task2 {
	public static void main(String[] args) {
		OutIn.Start2();
	}
	
	public static int outcome(int year, int month) {
		
		boolean z;
        if(year%4==0 && year%100==0 && year%400==0) z=true;
        else z=false;
        int[] visokos = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
        int[] neVisokos = new int [] {31,28,31,30,31,30,31,31,30,31,30,31};
        int point;
        if(z) point = visokos[month-1];
        else point = neVisokos[month-1];
		return point;
		
	}
}
