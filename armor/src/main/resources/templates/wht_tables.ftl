<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>数据库</title>
    <!--layui-->
    <link rel="stylesheet" type="text/css" href="/layui/layui-v2.4.5/css/layui.css" />
    <script type="text/javascript" src="/layui/layui-v2.4.5/layui.all.js"></script>
</head>
<body>
<#list tables as table>
<div id="table_${table.TABLE_NAME}" style="padding:0 20px;">
    <div style="border: 1px solid #139ff7;margin:5px 0;">
        <table class="layui-table" style="margin:0;">
            <thead>
            <tr style="background: #139ff7;"><th colspan="6"><h3 style="font-weight:bold;color: #fff;">${table_index + 1}.&nbsp;数据表&nbsp;“<span>${table['TABLE_NAME']}</span>”&nbsp;&nbsp;<span style="color:red;background:#fff;padding:5px;">${table['TABLE_COMMENT']}</span></h3></th></tr>
            <tr>
                <th style="width: 30px;">序号</th>
                <th style="width: 300px;">字段</th>
                <th style="width: 200px;">类型及长度</th>
                <th style="width: 100px;">IS_NULL</th>
                <th style="width: 180px;">默认值</th>
                <th>注释</th>
            </tr>
            </thead>
            <tbody>
            <#list table.COLUMNS as item>
            <tr>
                <td>{$index + 1}</td>
                <td><span style="font-weight: bold;">${table['TABLE_NAME']}::</span><span style="color:#ee32da;">${item.COLUMN_NAME}</span></td>
                <td title="${item.DATA_TYPE}">${item.COLUMN_TYPE}<span style="color: red;">&nbsp;&nbsp;${item.EXTRA}</span></td>
                <td>${item.IS_NULLABLE}</td>
                <td>${item.COLUMN_DEFAULT}</td>
                <td>${item.COLUMN_COMMENT}</td>
            </tr>
            </#list>
            <tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>
            </tbody>
        </table>
    </div>
</div>
</#list>

</body>
</html>