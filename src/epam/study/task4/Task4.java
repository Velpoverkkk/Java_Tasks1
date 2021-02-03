package epam.study.task4;

import epam.study.task4.OutIn;

public class Task4 {
	public static void main(String[] args) {
		OutIn.Start4();
	}
	
	public static boolean outcome(int[] ABCD) {
		int point=0;
		for(int i=0;i<4;i++) {
			 if(ABCD[i]%2==0) point++;
		 }
		if(point>=2) return true;
        else  return false;
	}
	
}