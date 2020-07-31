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
    <script src="/static/js2/jquery-3.5.0.min.js"></script>
    <script>
        $(function () {
            alert(2222);
            var a = ["abc","bcd","cdb"];
            var c = {"id":12,"pid":13,"name":"abc"};
            var b = [{"id":12,"pid":13,"name":"嘻嘻"},{"id":45,"pid":66,"name":"qqq"},{"id":15,"pid":99,"name":"cgd"}];
            //在js里面如何把一个对象转换成json字符串    使用JSON.stringify()
           /* alert(JSON.stringify(a));
            alert(typeof(JSON.stringify(a)));*/
            $.ajax({
                type:"post",
                url:"/tc/demo2.ajax",
                /*dataType设置返回值类型*/
                dataType:"json",
                /*contentType设置传过去的值的数据类型*/
                contentType:"application/json",
                data:JSON.stringify(b),
                success:function (info) {
                    $(info).each(function (i,m) {
                        alert("id:"+m.id+"  pid:"+m.pid+" name:"+m.name);
                    })
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
