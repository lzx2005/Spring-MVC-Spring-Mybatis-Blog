<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../layout/tag.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Welcome~</title>
    <base href="<%=basePath %>"/>
    <%@include file="../layout/css.jsp" %>
    <%@include file="../layout/script.jsp" %>
</head>

<body>

<%@include file="../layout/nav.jsp" %>

<div class="jumbotron jumb-block">
    <div class="container">
        <h1>Hello, world!</h1>
        <p>${blogs }</p>
        <p><a class="btn btn-primary btn-lg" href="http://v3.bootcss.com/examples/jumbotron/#" role="button">Learn more
            »</a></p>
    </div>
</div>

<div class="container">

    <div class="row">

        <div class="col-md-8">

            <div class="row">

                <c:forEach var="item" items="${blogs.data.list }" varStatus="status">
                    <div class="col-md-12 blog-block">
                        <h2>${item.title }</h2>
                        <div class="font1">
                            <span class="glyphicon glyphicon-user" aria-hidden="true"></span> ${item.author }
                            <span class="pull-right"><span class="glyphicon glyphicon-time" aria-hidden="true"></span> ${item.createTime}</span>
                        </div>
                        <p></p>
                        <p>
                            <a class="btn btn-default" href="<%=basePath%>/blog/${item.blogId}/overview" role="button">View details »</a>
                            <%--<a class="btn btn-primary" href="#" role="button">See More</a>
                            <a class="btn btn-danger" href="#" role="button">Delete</a>--%>
                        </p>
                    </div>
                </c:forEach>
            </div>


        </div>
        <div class="col-md-4">
            <div class="my-info">
                <div class="text-center">
                    <img class="my-avatar" src="<%=basePath%>resources/image/avatar.png">
                </div>
                <div>
                    <p>姓名:lzx2005</p>
                    <p>年龄:16</p>
                    <p>姓名:lzx2005</p>
                    <p>姓名:lzx2005</p>
                    <p>姓名:lzx2005</p>

                </div>
            </div>
        </div>

    </div>


</div> <!-- /container -->

<%@include file="../layout/footer.jsp" %>
<script type="text/javascript">
    $(function () {
        console.log("载入完毕");
        //loginScript.beforeSubmit();
    });
</script>
</body>
</html>