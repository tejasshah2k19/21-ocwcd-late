package com.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
//Tag 
//IterationTag
//BodyTag* 
public class LoopTag extends TagSupport {

	int count; // attribute --- instance variable

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int doStartTag() throws JspException {
		// loop -> 3 --> body
		return EVAL_BODY_INCLUDE;//body print --> doAfterBody 
	}

	@Override
	public int doAfterBody() throws JspException {

		count--;//0
		if (count == 0)
			return SKIP_BODY; // print stop
		else
			return EVAL_BODY_AGAIN;// again print

	}

	@Override
	public int doEndTag() throws JspException {
		return super.doEndTag();
	}
}
