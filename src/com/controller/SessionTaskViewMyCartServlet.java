package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTaskViewMyCartServlet")
public class SessionTaskViewMyCartServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		ArrayList<Integer> products = (ArrayList<Integer>) session.getAttribute("products");

		response.setContentType("text/html");// MIME
		out.print("<html><body>");

		if (products.size() == 0) {
			out.print("Cart it Empty");
		} else {
			int iPhoneCounter = 0;
			int legionCounter = 0;
			int mwCounter = 0;
			for (int productId : products) {
				if (productId == 1) {
//					out.print("Iphone11 52000 <br>");
					iPhoneCounter++;
				}

				if (productId == 2) {
//					out.print("LegionY540 1,52,000 <br>");
					legionCounter++;
				}

				if (productId == 3) {
//					out.print("MicroWave 22000 <br>");
					mwCounter++;
				}
			}

			out.print("<table>");
			out.print("<tr>");
			out.print("<th>ProductName</th><th>Price</th><th>Qty</th><th>Total</th>");
			out.print("</tr>");

			if (iPhoneCounter != 0) {
				out.print("<tr><td>Iphone11</td><td>52000</td><td>" + iPhoneCounter + "</td><td>"
						+ (52000 * iPhoneCounter) + "</td></tr>");
			}

			if (legionCounter != 0) {
				out.print("<tr><td>LegionY540</td><td>1,52,000</td><td>" + legionCounter + "</td><td>"
						+ (152000 * legionCounter) + "</td></tr>");
			}

			if (mwCounter != 0) {
				out.print("<tr><td>MicroWave</td><td>22000</td><td>" + mwCounter + "</td><td>" + (22000 * mwCounter)
						+ "</td></tr>");
			}
			out.print("</table>");

		}

// if (session.getAttribute("productId") == null) {
//			out.print("Cart is Empty");
//		} else {
//			int productId = (Integer) session.getAttribute("productId");
//
//			if (productId == 1) {
//				out.print("Iphone11 52000");
//			}
//
//			if (productId == 2) {
//				out.print("LegionY540 1,52,000");
//			}
//
//			if (productId == 3) {
//				out.print("MicroWave 22000");
//			}
//		}
		out.print("</body></html>");

	}
}
