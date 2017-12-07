package com.samples.vulnerabilities;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.naming.Context;

public class Passwords {
	private String SEC_PASSWORD = "letMeIn!";

	public Passwords() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException {
		System.out.println(SEC_PASSWORD);
		Properties props = new Properties();
		props.put(Context.SECURITY_CREDENTIALS, "p@ssw0rd");

		byte[] key = { 1, 2, 3, 4, 5, 6, 7, 8 };
		SecretKeySpec spec = new SecretKeySpec(key, "AES");
		Cipher aes = Cipher.getInstance("AES");
		aes.init(Cipher.ENCRYPT_MODE, spec);
		aes.doFinal();
	}

}
