package honux.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printCalendar(int year, int month) {
		System.out.printf("    <<%4d년 %3d월>>\n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
		
		int maxDay = getmaxDaysOfMonth(month);
		
		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if (i % 7 == 0)
			System.out.println();
		}
		System.out.println();
//		System.out.println("1\t2\t3\t4\t5\t6\t7");
//		System.out.println("8\t9\t10\t11\t12\t13\t14");
//		System.out.println("15\t16\t17\t18\t19\t20\t21");
//		System.out.println("22\t23\t24\t25\t26\t27\t28");
		
	}
}
