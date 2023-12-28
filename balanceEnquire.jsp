
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1 style="color: blue">Balance Enquire</h1>
<c:choose>
    <c:when test="${not empty account}">
        <table border="1">
            <tr>
                <th>ACCOUNT NO</th>
                <th>USERNAME</th>
                <th>AMOUNT</th>
                <th>ADDRESS</th>
                <th>PHONE NUMBER</th>
            </tr>
            <tr>
                <td>${account.accno}</td>
                <td>${account.name}</td>
                <td>${account.amount}</td>
                <td>${account.address}</td>
                <td>${account.mno}</td>
            </tr>
        </table>
    </c:when>
    <c:otherwise>
        <p>No account details found.</p>
        <!-- Add debugging information -->
        <p>Debug Info:</p>
        <p>Account: ${account}</p>
    </c:otherwise>
</c:choose>
 