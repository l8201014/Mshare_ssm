<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/31
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>

    <link type="text/css" href="../../css/H-ui.login.css">
    <link type="text/css" href="../../css/H-ui.min.css">
    <link type="text/css" href="../../css/iconfont.css">
    <title>后台登录 - H-ui.admin v3.0</title>
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
    <div id="loginform" class="loginBox">
        <form class="form form-horizontal" action="user/showUser" method="post">
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
                <div class="formControls col-xs-8">
                    <input id="username" name="" type="text" placeholder="账户" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
                <div class="formControls col-xs-8">
                    <input id="password" name="" type="password" placeholder="密码" class="input-text size-L">
                </div>
            </div>

            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <label for="online">
                        <input type="checkbox" name="online" id="online" value="">
                        使我保持登录状态</label>
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                    <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
                </div>
            </div>
        </form>
    </div>
</div>
<div class="footer">Copyright 你的公司名称 by H-ui.admin v3.0</div>
<!--此乃百度统计代码，请自行删除-->
<%--<script>--%>
    <%--var _hmt = _hmt || [];--%>
    <%--(function() {--%>
        <%--var hm = document.createElement("script");--%>
        <%--hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";--%>
        <%--var s = document.getElementsByTagName("script")[0];--%>
        <%--s.parentNode.insertBefore(hm, s);--%>
    <%--})();--%>
<%--</script>--%>
<!--/此乃百度统计代码，请自行删除-->
</body>
</html>
