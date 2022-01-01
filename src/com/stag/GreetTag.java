package com.stag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport {

	public void doTag() throws JspException, IOException {

		Date d = new Date();

		int h = d.getHours();

		JspWriter out = getJspContext().getOut();

		if (h >= 0 && h <= 11) {
			out.print("Good Morning");
		} else if (h >= 12 && h <= 15) {
			out.print("Good Noon");
		} else if (h >= 16) {
			out.print("Good Evenning");
		}

	}
}
