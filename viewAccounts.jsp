
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
body{
position:absolute;
top:50%;
left:50%;
transform:translate(-50%,-50%);
text-align:center;
}
</style>
<body>
<h1 style="color:blue">Account Details</h1>
<table border="1">
  <tr>
    <th>ACCOUNT NO</th>
    <th>NAME</th>
    <th>PASSWORD</th>
    <th>C_PASSWORD</th>
    <th>AMOUNT</th>
    <th>ADDRESS</th>
    
    <th>MOBILE NO</th>
    
   </tr>
  
  <c:forEach var="account" items="${viewall }">
  <tr>
    <td>${account.accno }</td>
    <td>${account.name }</td>
    <td>${account.password }</td>
    <td>${account.c_password }</td>
    <td>${account.amount }</td>
    <td>${account.address }</td>
    <td>${account.mno }</td>
    
  </tr>
  </c:forEach>
</table>
<p></p>
<a href="/home">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/newAccount">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/closeAccount">Close Account</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/aboutUs">About Us</a><p></p>
<a href="/viewAccounts">View Accounts</a>

</body>
 