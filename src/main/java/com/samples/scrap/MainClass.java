package com.samples.scrap;

public class MainClass {

	private String primary;
	private String secondary;
	private String primary1;
	private String secondary1;
	private String primary2;
	private String secondary2;
	private String primary3;
	private String secondary4;

	public String getPrimary() {
		return primary;
	}

	public void setPrimary(String primary) {
		this.primary = primary;
	}

	public String getSecondary() {
		return secondary;
	}

	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}

	public String getPrimary1() {
		return primary1;
	}

	public void setPrimary1(String primary1) {
		this.primary1 = primary1;
	}

	public String getSecondary1() {
		return secondary1;
	}

	public void setSecondary1(String secondary1) {
		this.secondary1 = secondary1;
	}

	public String getPrimary2() {
		return primary2;
	}

	public void setPrimary2(String primary2) {
		this.primary2 = primary2;
	}

	public String getSecondary2() {
		return secondary2;
	}

	public void setSecondary2(String secondary2) {
		this.secondary2 = secondary2;
	}

	public String getPrimary3() {
		return primary3;
	}

	public void setPrimary3(String primary3) {
		this.primary3 = primary3;
	}

	public String getSecondary4() {
		return secondary4;
	}

	public void setSecondary4(String secondary4) {
		this.secondary4 = secondary4;
	}

	public MainClass(String color) {
		if (color != null) {
			secondary = null;
		}
		primary = color; // Noncompliant; "primary" is Nonnull but could be set
							// to null here
	}

	public MainClass() { // Noncompliant; "primary" Nonnull" but is not
							// initialized
	}

	public String indirectMix() {

		String mix = null;
		return mix; // Noncompliant; return value is Nonnull, but null is
					// returned.}}
	}

}