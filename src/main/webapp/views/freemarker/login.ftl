<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="content-type" />
    <meta http-equiv="content-language" content="pl-pl" />
    <title>Login</title>
</head>
<body>
    <h1>zażółć gęślą jaźń - login</h1>
    <#if Session.SPRING_SECURITY_LAST_EXCEPTION?? && Session.SPRING_SECURITY_LAST_EXCEPTION.message?has_content>
        Błąd logowania!
    </#if>
    <form name="f" action="/login" method="POST" onload="document.f.username.focus();">
        <table>
            <tr>
                <td>Login:</td><td><input type="text" name="username" value=''/></td>
            </tr>
            <tr>
                <td>Hasło:</td><td><input type="password" name="password" value=''/></td>
            </tr>
            <tr>
                <td colspan="2"><input name="submit" type="submit" value="Login" /></td>
            </tr>
        </table>
    </form>
</body>
</html>