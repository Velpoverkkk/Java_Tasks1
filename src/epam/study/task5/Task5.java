package epam.study.task5;

import epam.study.task5.OutIn;

public class Task5 {
	public static void main(String[] args) {
		OutIn.Start5();
	}
	
	public static boolean outcome(int inputValue) {
		int summa=0;
		for(int i=1;i<inputValue;i++) {
            if(inputValue%i==0) summa+=i;
        }
		if(inputValue==summa) return true;
		else return false;
	}
}
	