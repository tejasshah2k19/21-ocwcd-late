package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

//classic-tag -> Tag  
public class CurrTag extends TagSupport {

	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();// tag call

		// google api -- finance

		try {
			out.print("75Rs");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
//		return EVAL_PAGE;//evaluate the page --> 

		return EVAL_PAGE;
	}
}

//.tld 
