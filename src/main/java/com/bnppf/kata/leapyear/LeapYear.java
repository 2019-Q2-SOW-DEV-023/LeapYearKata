package com.bnppf.kata.leapyear;

import static com.bnppf.kata.leapyear.DivisionBase.FOUR;
import static com.bnppf.kata.leapyear.DivisionBase.FOUR_HUNDRED;
import static com.bnppf.kata.leapyear.DivisionBase.HUNDRED;

public class LeapYear {

	public boolean isLeapYear(int year) {
		return isMultipleOf4(year) && (isNotMiltipleOf100(year) ||  isMiltipleOf400(year));
	}

	private boolean isMiltipleOf400(int year) {
		return year%FOUR_HUNDRED.getBase() == 0;
	}

	private boolean isNotMiltipleOf100(int year) {
		return year%HUNDRED.getBase() != 0;
	}

	private boolean isMultipleOf4(int year) {
		return year%FOUR.getBase() == 0;
	}

}
