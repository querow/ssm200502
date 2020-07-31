<%--
  Created by IntelliJ IDEA.
  User: MACHENIKE
  Date: 2020/7/27
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script src="/static/js2/jquery-3.5.0.min.js"></script>
    <script>
        function  add() {
            //var id = $("#a").val();
           //alert($("form").serialize());
            $.ajax({
                type:"post",
                url:"/tc/demo3.ajax",
                /*dataType设置返回值类型*/
                dataType:"text",
                data:$("form").serialize(),
                success:function (info) {
                    alert(info);
                },
                error:function () {
                    alert("ajax ERROR!!!") ;
                }


            })
        }


    </script>
</head>
<body>
    <form action="" method="post">
        id  <input type="text" id="a" name="id"> <br>
        pid<input type="text" name="pid"> <br>
       名称 <input type="text" name="name"> <br>
        <input type="button" onclick="add()" value="add">
    </form>
</body>
</html>
