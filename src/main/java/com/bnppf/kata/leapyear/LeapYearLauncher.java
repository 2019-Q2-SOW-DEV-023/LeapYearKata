package com.bnppf.kata.leapyear;

public class LeapYearLauncher {
	public static void main(String[] args) {
		LeapYear leapYear = new LeapYear();
		for (String str : args) {
			int year = Integer.parseInt(str);
			System.out.println(year + " isLeapYear? : " + leapYear.isLeapYear(year));
		}
	}
}