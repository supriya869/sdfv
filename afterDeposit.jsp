
<!DOCTYPE html>
<html>
<head>
    <title>After Deposit</title>
</head>
<body>
    <h1>After Deposit</h1>
    
    <% if (request.getAttribute("message") != null) { %>
        <p><%= request.getAttribute("message") %></p>
    <% } else { %>
        <p>No message available</p>
    <% } %>
    
    <a href="/home">Back to Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/newAccount">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/closeAccount">Close Account</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/aboutUs">About Us</a><p></p>
<a href="/viewAccounts">View Accounts</a>
</body>
</html>

 