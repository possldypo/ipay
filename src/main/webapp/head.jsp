<%@ page contentType="text/html; charset=UTF-8"%>

<link rel="stylesheet" type="text/css" href="${basePath}/static/js/lib/head/normalize.css" />
<link rel="stylesheet" type="text/css" href="${basePath}/static/js/lib/head/default.css">
<link rel="stylesheet" type="text/css" href="${basePath}/static/js/lib/head/styles.css">

<header>
    <h1>It's a mystery</h1>
    <nav>
        <a href="${basePath}/index/home">首页</a>
        <%--<a href="javascript:void(0)">待定</a>--%>
        <a href="${basePath}/utils/utilPage">工具</a>
        <a href="javascript:void(0)">关于我们</a>
        <a href="javascript:void(0)">打赏一下</a>
        <a href="javascript:void(0)">登陆</a>
    </nav>
</header>
<script src="${basePath}/static/js/lib/jquery-2.1.1.min.js"></script>
<script>
    $(function () {
        $(window).scroll(function () {
            var winTop = $(window).scrollTop();
            if (winTop >= 30) {
                $('body').addClass('sticky-header');
            } else {
                $('body').removeClass('sticky-header');
            }
        });
    });
</script>