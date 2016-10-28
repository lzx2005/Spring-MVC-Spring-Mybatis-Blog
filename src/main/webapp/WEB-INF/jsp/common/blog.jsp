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

    <title>${blog.title }</title>
    <base href="<%=basePath %>"/>
    <%@include file="../layout/css.jsp" %>
    <%@include file="../layout/script.jsp" %>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<%=basePath %>">Project name</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <c:choose>
                <c:when test="${empty sessionScope.user}">
                    <form class="navbar-form navbar-right" method="post" onSubmit="return loginScript.beforeSubmit()">
                        <div class="form-group">
                            <input type="text" placeholder="用户名" id="username" name="username" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="password" placeholder="密码" id="password" name="password" class="form-control">
                        </div>
                        <button type="submit" class="btn btn-success">登录</button>
                    </form>
                </c:when>
                <c:otherwise>
                    <span class="pull-right">
                        <a class="navbar-brand" href="<%=basePath %>admin">${sessionScope.user.username}</a>
                        <a class="navbar-brand" href="<%=basePath %>log_out">退出登录</a>
                    </span>
                </c:otherwise>
            </c:choose>
        </div><!--/.navbar-collapse -->
    </div>
</nav>
<%--
<div class="jumbotron jumb-block">
    <div class="container">
        <h1>Hello, world!</h1>
        <p>This is a template for a simple marketing or informational website. It includes a large callout called a
            jumbotron and three supporting pieces of content. Use it as a starting point to create something more
            unique.</p>
        <p><a class="btn btn-primary btn-lg" href="http://v3.bootcss.com/examples/jumbotron/#" role="button">Learn more
            »</a></p>
    </div>
</div>--%>

<div class="container top-60">
    <div class="row">
        <div class="col-md-12">
            <div class="row" id="content">
                ${blog.content }
            </div>
        </div>
    </div>


</div> <!-- /container -->
<textarea id="markdownsource" class="hidden">
    ${blog.content }
</textarea>

<%@include file="../layout/footer.jsp" %>
<script type="text/javascript">
    $(function () {
        console.log("载入完毕");
        //loginScript.beforeSubmit();
    });
</script>

<c:if test="${blog.markdown == 1}">
<script src="//cdn.bootcss.com/remarkable/1.7.1/remarkable.min.js"></script>
<script src="//cdn.bootcss.com/highlight.js/9.7.0/highlight.min.js"></script>
<script type="text/javascript">
    function Editor(input, preview) {
        this.update = function () {
            var str = input.value.trim();
            console.log(str)
            var md = new Remarkable();
            preview.innerHTML = md.render(str);
        };
        input.editor = this;
        this.update();
    }
    new Editor(document.getElementById("markdownsource"), document.getElementById("content"));
    hljs.initHighlightingOnLoad();
</script>
</c:if>
</body>
</html>