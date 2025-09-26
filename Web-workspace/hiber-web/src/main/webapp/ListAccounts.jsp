<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="java.util.List,
    com.coforge.training.hiberweb.dao.AccountDAO,
    com.coforge.training.hiberweb.model.Account" %>
    <%
    AccountDAO dao = new AccountDAO();
    List<Account> accounts = dao.getAll(); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Accounts</title>
  <style>
    body { font-family: Arial, sans-serif; background: #fff7ed; padding: 2rem; }
    h1 { color: #f97316; text-align: center; }
    table { width: 90%; margin: auto; border-collapse: collapse; box-shadow: 0 4px 12px rgba(0,0,0,0.1); }
    th { background: #f97316; color: #fff; padding: 12px; }
    td { padding: 10px; border-bottom: 1px solid #ddd; }
    tr:nth-child(even) td { background: #fef3c7; }
  </style>
</head>
<body>
<h1>Bank Accounts</h1>
  <table>
    <tr><th>ID</th><th>Account No</th><th>Holder</th><th>Balance</th><th>Type</th><th>Extra</th></tr>
    <% for(Account a : accounts) { %>
      <tr>
        <td><%= a.getId() %></td>
        <td><%= a.getAccountNumber() %></td>
        <td><%= a.getHolderName() %></td>
        <td><%= a.getBalance() %></td>
        <td><%= a.getClass().getSimpleName() %></td>
        <td>
          <% if(a instanceof com.coforge.training.hiberweb.model.SavingsAccount) { %>
            Interest: <%= ((com.coforge.training.hiberweb.model.SavingsAccount)a).getInterestRate() %>
          <% } else if(a instanceof com.coforge.training.hiberweb.model.CurrentAccount) { %>
            Overdraft: <%= ((com.coforge.training.hiberweb.model.CurrentAccount)a).getOverdraftLimit() %>
          <% } %>
        </td>
      </tr>
    <% } %>
  </table>
</body>
</html>