<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="common.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>home</title>
    <link rel="stylesheet" type="text/css" href="${basePath}/static/css/style.css">
    <link rel="stylesheet" href="${basePath}/static/js/lib/pinterest_grid/normalize.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/static/js/lib/pinterest_grid/default.css">
    <link rel="stylesheet" href="${basePath}/static/js/lib/top/reset.css"> <!-- CSS reset -->
    <link rel="stylesheet" href="${basePath}/static/js/lib/top/style.css"> <!-- Gem style -->
    <script src="${basePath}/static/js/lib/top/modernizr.js"></script> <!-- Modernizr -->
</head>
<body>
<style type="text/css">
    #gallery-wrapper {
        position: relative;
        max-width: 75%;
        width: 75%;
        margin:50px auto;
    }
    img.thumb {
        width: 100%;
        max-width: 100%;
        height: auto;
    }
    .white-panel {
        position: absolute;
        background: white;
        border-radius: 5px;
        box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
        padding: 10px;
    }
    .white-panel h1 {
        font-size: 1em;
    }
    .white-panel h1 a {
        color: #A92733;
    }
    .white-panel:hover {
        box-shadow: 1px 1px 10px rgba(0,0,0,0.5);
        margin-top: -5px;
        -webkit-transition: all 0.3s ease-in-out;
        -moz-transition: all 0.3s ease-in-out;
        -o-transition: all 0.3s ease-in-out;
        transition: all 0.3s ease-in-out;
    }
</style>
<jsp:include page="head.jsp"></jsp:include>
<div>

<section id="gallery-wrapper">
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/1.jpg" class="thumb">
        <h1><a href="#">Title 1</a></h1>
        <p>模块1</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/2.jpg" class="thumb">
        <h1><a href="#">Title 2</a></h1>
        <p>Description 2</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/3.jpg" class="thumb">
        <h1><a href="#">Title 3</a></h1>
        <p>Description 3</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/4.jpg" class="thumb">
        <h1><a href="#">Title 4</a></h1>
        <p>Description 4</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/5.jpg" class="thumb">
        <h1><a href="#">Title 5</a></h1>
        <p>Description 5</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/6.jpg" class="thumb">
        <h1><a href="#">Title 6</a></h1>
        <p>Description 6</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/7.jpg" class="thumb">
        <h1><a href="#">Title 7</a></h1>
        <p>Description 7</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/8.jpg" class="thumb">
        <h1><a href="#">Title 8</a></h1>
        <p>Description 8</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/9.jpg" class="thumb">
        <h1><a href="#">Title 9</a></h1>
        <p>Description 9</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/10.jpg" class="thumb">
        <h1><a href="#">Title 10</a></h1>
        <p>Description 10</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/11.jpg" class="thumb">
        <h1><a href="#">Title 11</a></h1>
        <p>Description 11</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/12.jpg" class="thumb">
        <h1><a href="#">Title 12</a></h1>
        <p>Description 12</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/13.jpg" class="thumb">
        <h1><a href="#">Title 13</a></h1>
        <p>Description 13</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/14.jpg" class="thumb">
        <h1><a href="#">Title 14</a></h1>
        <p>Description 14</p>
    </article>
    <article class="white-panel">
        <img src="${basePath}/static/js/lib/pinterest_grid/img/15.jpg" class="thumb">
        <h1><a href="#">Title 15</a></h1>
        <p>Description 15</p>
    </article>
</section>

</div>
<a href="#0" class="cd-top">Top</a>

<%--瀑布流插件--%>
<script src="${basePath}/static/js/lib/jquery-2.1.1.min.js"></script>
<script src="${basePath}/static/js/lib/pinterest_grid/pinterest_grid.js"></script>
<script src="${basePath}/static/js/lib/top/main.js"></script>
<script type="text/javascript">
    $(function(){
        $("#gallery-wrapper").pinterest_grid({
            no_columns: 4,
            padding_x: 10,
            padding_y: 10,
            margin_bottom: 50,
            single_column_breakpoint: 300
        });

    });
</script>
</body>
</html>
