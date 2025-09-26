package com.coforge.training.hiberweb.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.coforge.training.hiberweb.dao.AccountDAO;
import com.coforge.training.hiberweb.model.Account;
import com.coforge.training.hiberweb.model.CurrentAccount;
import com.coforge.training.hiberweb.model.SavingsAccount;

/**
 * Servlet implementation class AccountServlet
 */
@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final AccountDAO dao = new AccountDAO();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accountNumber = request.getParameter("accountNumber");
        String holderName = request.getParameter("holderName");
        String balanceStr = request.getParameter("balance");
        String accountType = request.getParameter("accountType");

        double balance = 0.0;
        if (balanceStr != null && !balanceStr.isBlank()) {
            balance = Double.parseDouble(balanceStr);
        }

        Account account;
        if ("SAVINGS".equalsIgnoreCase(accountType)) {
            SavingsAccount sa = new SavingsAccount();
            sa.setInterestRate(parseDoubleSafe(request.getParameter("interestRate")));
            account = sa;
        } else if ("CURRENT".equalsIgnoreCase(accountType)) {
            CurrentAccount ca = new CurrentAccount();
            ca.setOverdraftLimit(parseDoubleSafe(request.getParameter("overdraftLimit")));
            account = ca;
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid account type");
            return;
        }

        account.setAccountNumber(accountNumber);
        account.setHolderName(holderName);
        account.setBalance(balance);

        dao.save(account);
        response.sendRedirect("ListAccounts.jsp");
	}
	
	 private double parseDoubleSafe(String v) {
	        try {
	            return (v == null || v.isBlank()) ? 0.0 : Double.parseDouble(v);
	        } catch (NumberFormatException e) {
	            return 0.0;
	        }
	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
