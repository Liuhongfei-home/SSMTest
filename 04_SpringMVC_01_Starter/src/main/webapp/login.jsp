<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form method="post" action="/login">
    <table align="center">
        <caption><h1 style="color: springgreen">登录</h1></caption>

        <tr>
            <td>账号</td>
            <td><input type="text" name="username"></td>
        </tr>

        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>
            <td colspan="2" align="center">
                <input type="reset" value="重置">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
