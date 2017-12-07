package com.findbugs.examples;

@Deprecated
public class CalendarYear {
	//FIXME : Remove this class after usage
	private String[] months;

	public String[] getMonths() {
		return months;
	}
	
	//TODO : Code cleanup

	public void setMonths(String[] months) {
		this.months = months;
	}

}
