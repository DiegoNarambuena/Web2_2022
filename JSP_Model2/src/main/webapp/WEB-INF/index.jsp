<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Transfencia entre cuentas</h1>
        
        <h2>Cuenta origen</h2>
        
        <p>Nro Cuenta   Saldo</p>
        <select name="cuenta_origen" multiple>
                 <c:forEach items= "{cuenta.nroCuenta}" var="item">
                    ${cuenta.getNroCuenta(item)}<br>
                    </c:forEach>
                <option value="2">segunda</option>
                <option value="3">tercera</option>
        </select>
    
        <p>Cuenta Destino</p>
        <p>Nro Cuenta   Saldo</p>
        <select name="cuenta_destino" multiple>
                <option value="1">${account.getItem(3)}     ${account.getItem(2)}</option>
                <option value="2">segunda</option>
                <option value="3">tercera</option>
        </select>
        
        <p>Monto a transferir</p>
        <input type="number" name="edad" min="0" required>
    </body>
</html>
