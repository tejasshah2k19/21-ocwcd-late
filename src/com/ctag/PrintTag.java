package com.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTag extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		System.out.println("print tag -- do start tag() ");
		//return SKIP_BODY;// do not print body on jsp page 
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
}
