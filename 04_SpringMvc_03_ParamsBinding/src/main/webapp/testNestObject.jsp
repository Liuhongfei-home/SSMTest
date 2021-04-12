
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用嵌套的对象进行参数绑定</title>
</head>
<body>
<form method="post" action="/user/testNestObject">
    <table align="center">
        <caption><h1 style="color: red">测试参数绑定</h1></caption>

        <tr>
            <td>账号</td>
            <td><input type="text" name="username"></td>
        </tr>

        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>
            <td>年龄</td>
            <td><input type="text" name="studentInfo.age"></td>
        </tr>

        <tr>
            <td>性别</td>
            <td>
                <input type="radio" name="studentInfo.gender" value="男"> 男
                <input type="radio" name="studentInfo.gender" value="女" checked> 女
            </td>
        </tr>

        <tr>
            <td>信息</td>
            <td>
                <input type="text" name="studentInfo.info">
            </td>
        </tr>

        <tr>
            <td colspan="2" align="center">
                <input type="reset" value="重置">&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
