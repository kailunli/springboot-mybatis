<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>userList</title>

    <link rel="stylesheet" type="text/css" href="/layui/layui-v2.4.5/css/layui.css" />
    <script type="text/javascript" src="/layui/layui-v2.4.5/layui.all.js"></script>
</head>
<body>
    <div style="padding: 10px;">
        <table class="layui-table">
            <thead>
            <tr>
                <th>序号</th>
                <th>昵称（UID）</th>
                <th>手机号</th>
                <th>编码</th>
            </tr>
            </thead>
            <tbody>
            <#list userList as user>
                <tr>
                    <td>${user_index + 1}</td>
                    <td>${user.nickName}（${user.userId}）</td>
                    <td>${user.phone}</td>
                    <td>${user.userCode}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</body>
</html>