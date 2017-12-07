package com.sonar.bugs;
public enum Continent {

	NORTH_AMERICA (23, 24709000),
	EUROPE (50, 39310000),
	UNKNOWN(0, 0);

	public int countryCount;
	private int landMass;

	Continent(int countryCount, int landMass) {
		this.countryCount = countryCount;
		this.landMass = landMass;
	}

	public void setLandMass(int landMass) {  // Noncompliant
		this.landMass = landMass;
	}
	
	public static Continent getByLandMass(int landMass) {
		for (Continent elem : Continent.values()) {
			if (elem.landMass == landMass) {
				return elem;
			}
		}
		return UNKNOWN;
	}
}
