
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
<h1 style="color:red">SDFC BANK</h1>
<h2 style="color:green">EXTRAORDINARY SERVICES</h2>
<a href="/home">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/newAccount">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/closeAccount">Close Account</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/aboutUs">About Us</a><p></p>
<a href="/viewAccounts">View Accounts</a>
<p></p>
<!-- 
<form action="/afterTransfer" method="POST">
Account No:<input type="number" name="accno"><p></p>
Name:<input type="text" name="name"><p></p>

Password:<input type="password" name="password"><p></p>
Target Account Number:<input type="number" name="target_accno"><p></p>
Transfer Amount:<input type="number" name="transfer_amount"><p></p>
<input type="submit" value="Submit"><p></p>
<input type="submit" value="Clear"><p></p>
</form>
 -->
 <form action="/afterTransfer" method="POST">
    From Account:<input type="number" name="fromAccount"><p></p>
    Name:<input type="text" name="name"><p></p>
    Password:<input type="password" name="password"><p></p>
    To Account:<input type="text" name="toAccount"><p></p>
    <!-- Transfer Amount:<input type="number" name="transfer_amount"><p></p> -->
    Amount:<input type="number" name="amount"><p></p> <!-- Add 'amount' input field -->
    <input type="submit" value="Submit"><p></p>
    <input type="submit" value="Clear"><p></p>
</form>
 
</body>
 