<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="common.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>MD5</title>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div style="text-align: center">
    <input type="text" id="input" placeholder="input"><br/>
    <a href="javascript:void(0)" onclick="md5()">md5</a><br/>
    <div id="output"></div>
</div>


<script src="${basePath}/static/js/lib/jquery-2.1.1.min.js"></script>
<script src="${basePath}/static/js/lib/md5.js"></script>
<script type="text/javascript">
    function md5(){
        $("#output").html(hex_md5($("#input").val()));
    }
</script>
</body>
</html>
