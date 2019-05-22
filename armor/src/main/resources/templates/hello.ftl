<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FreeMarker DEMO</title>

    <link rel="stylesheet" type="text/css" href="/layui/layui-v2.4.5/css/layui.css" />
    <script type="text/javascript" src="/layui/layui-v2.4.5/layui.all.js"></script>
</head>
<body>
<div>
    <#list userList as item>
        <div class="layui-inline">${item!}</div>
    </#list>
</div>
</body>
</html>