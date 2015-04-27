package com.db1.passwordmeter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db1.passwordmeter.Password;

public class PasswordServlet extends HttpServlet {
	private static final long serialVersionUID = -7177575099035919148L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		final String password = request.getParameter("password");
		final PrintWriter out = response.getWriter();
		out.println(new Password(password).toJson());
		out.close();
	}
}
