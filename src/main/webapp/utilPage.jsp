<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="common.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>utils</title>
    <link rel="stylesheet" type="text/css" href="${basePath}/static/css/style.css">
    <link rel="stylesheet" href="${basePath}/static/js/lib/top/reset.css"> <!-- CSS reset -->
    <link rel="stylesheet" href="${basePath}/static/js/lib/top/style.css"> <!-- Gem style -->
    <script src="${basePath}/static/js/lib/top/modernizr.js"></script> <!-- Modernizr -->
    <link href="${basePath}/static/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<jsp:include page="head.jsp"></jsp:include>
<div>
    <h4 id="cards-with-equal-height-text-title">标题和文字高度相等的等高卡片布局</h4>
    <br>
    <div class="row">

        <div class="col-md-4 col-sm-6 jQueryEqualHeight3">
            <div class="card">
                <img class="card-img-top" src="http://via.placeholder.com/318x180" alt="Card image cap">
                <div class="card-body">
                    <h4 class="card-title">Card title</h4>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>

        <div class="col-md-4 col-sm-6 jQueryEqualHeight3">
            <div class="card">
                <img class="card-img-top" src="http://via.placeholder.com/318x180" alt="Card image cap">
                <div class="card-body">
                    <h4 class="card-title">Card title</h4>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content. Some quick example text to build on the card title and make up the bulk of the card's content. Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>

        <div class="col-md-4 col-sm-6 jQueryEqualHeight3">
            <div class="card">
                <img class="card-img-top" src="http://via.placeholder.com/318x180" alt="Card image cap">
                <div class="card-body">
                    <h4 class="card-title">Card title Card title Card title Card title Card title Card title</h4>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>

    </div>
</div>
<a href="#0" class="cd-top">Top</a>

<script src="${basePath}/static/js/lib/jquery-2.1.1.min.js"></script>
<script src="${basePath}/static/js/lib/top/main.js"></script>
<script type="text/javascript" src="${basePath}/static/js/lib/line/js/jquery-equal-height.min.js"></script>
<script type="text/javascript">
    function equal_height() {
        // Equal Card Height
        $('.jQueryEqualHeight1').jQueryEqualHeight();

        // Equal Card Height and Text Height
        $('.jQueryEqualHeight2').jQueryEqualHeight('.card .card-body .card-text');
        $('.jQueryEqualHeight2').jQueryEqualHeight('.card');

        // Equal Card Height, Text Height and Title Height
        $('.jQueryEqualHeight3').jQueryEqualHeight('.card .card-body .card-title');
        $('.jQueryEqualHeight3').jQueryEqualHeight('.card .card-body .card-text');
        $('.jQueryEqualHeight3').jQueryEqualHeight('.card');
    }
    $(window).on('load', function(event) {
        equal_height();
    });
    $(window).resize(function(event) {
        equal_height();
    });
</script>
</body>
</html>
