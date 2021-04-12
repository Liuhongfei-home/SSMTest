<%--
  Created by IntelliJ IDEA.
  User: 刘鸿飞
  Date: 2021/4/9
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试参数绑定</title>
</head>
<body>
        <form method="post" action="/user/testBaseAndString">
            <table align="center">
                <caption><h1 style="color:red;">测试参数绑定</h1></caption>

                <tr>
                    <td>账号</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td>年龄</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td>生日</td>
                    <td><input type="date" name="birthday"></td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td>
                        <input type="radio" name="gender" value="男">男
                        <input type="radio" name="gender" value="女">女
                    </td>
                </tr>
                <tr>
                    <td>信息</td>
                    <td><input type="text" name="info"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="reset" value="重置">
                        <input type="submit" value="提交">
                    </td>
                </tr>
            </table>
        </form>
</body>
</html>
