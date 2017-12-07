package com.samples.vulnerabilities;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// This is a sample doGet method
	}

	public static void main(String[] args) {
		// Noncompliant
		// updatePrices(req);

	}
}
