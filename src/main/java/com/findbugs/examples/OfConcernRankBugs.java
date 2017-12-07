package com.findbugs.examples;

public class OfConcernRankBugs {

	private String placeHolder = null;

	public OfConcernRankBugs() {
		this.placeHolder = "Test String";
	}

	private String getPlaceHolder() {
		return this.placeHolder;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placeHolder == null) ? 0 : placeHolder.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		OfConcernRankBugs object = (OfConcernRankBugs) obj;
		if(object == null)
			return false;
		return this.getPlaceHolder().equals(object.getPlaceHolder());
	}
	
}
