<%--
  Created by IntelliJ IDEA.
  User: MACHENIKE
  Date: 2020/7/27
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="/static/js2/jquery-3.1.1.min.js"></script>
    <script>
        $(function () {
            alert(111);
            var a = ["abc","bcd","cdb"];
            $.ajax({
                type:"post",
                url:"/tc/demo1.ajax",
                /*dataType设置返回值类型*/
                dataType:"text",
                /*contentType设置传过去的值的数据类型*/
                /*jq会正常将发送的数据已下面这种格式，后台默认以这种格式解析*/
                contentType:"application/x-www-form-urlencoded;charset=UTF-8",
                traditional:true,
                data:{
                    a:a
                },
                success:function (info) {
                    alert(info);
                },
                error:function () {
                    alert("ajax ERROR!!!") ;
                }


            })
        })

    </script>
</head>
<body>
<h1>这是我的第一个jsp</h1>
</body>
</html>
