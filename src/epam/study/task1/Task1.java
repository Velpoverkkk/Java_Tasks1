package epam.study.task1;

import epam.study.task1.OutIn;;

public class Task1 {
	public static void main(String[] args) {
		OutIn.Start1();
    }
	public static int outcome(int inputNumber) {
		inputNumber=inputNumber%10;
		inputNumber=(inputNumber*inputNumber)%10;
		return inputNumber;
	}
}
