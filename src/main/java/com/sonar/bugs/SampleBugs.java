package com.sonar.bugs;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

public class SampleBugs {
	public static void main(String[] args) {
		AtomicInteger aInt1 = new AtomicInteger(0);
		AtomicInteger aInt2 = new AtomicInteger(0);

		if (aInt1.equals(aInt2)) { 
			System.out.println("SampleBugs.main()");
		}  // Noncompliant

		double d = 1.1;

//		BigDecimal bd1 = new BigDecimal(d);
//		BigDecimal bd2 = new BigDecimal(1.1);

		BigDecimal bd3 = BigDecimal.valueOf(d);
		BigDecimal bd4 = BigDecimal.valueOf(1.1);

		//System.out.println("Noncompliant " + bd1 + " " + bd2 + " Compliant: ******************************************************************************" + bd3 + " " + bd4);

		Long l1 = Long.valueOf(1);
		Long l2 = Long.valueOf(2);
		if (l1.compareTo(l2) == -1) {  // Noncompliant
			// ...
		}
		if (l1.compareTo(l2) < 0) {
			// ...
		}
	}
}
