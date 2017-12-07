package com.findbugs.examples;

import java.math.BigDecimal;

public class BigValues {
	double d = 1.1;

	BigDecimal bd1 = new BigDecimal(d); // Noncompliant; see comment above
	BigDecimal bd2 = new BigDecimal(1.1); // Noncompliant; same result
	
	BigDecimal bd3 = BigDecimal.valueOf(d);
	BigDecimal bd4 = BigDecimal.valueOf(1.1);

}
