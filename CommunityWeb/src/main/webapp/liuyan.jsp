<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://localhost:8080/CommunityWeb/css/layui.css">
<link href="http://localhost:8080/CommunityWeb/css/base.css" rel="stylesheet">
<link href="http://localhost:8080/CommunityWeb/css/m.css" rel="stylesheet">

<script src="http://localhost:8080/CommunityWeb/js/jquery-1.8.3.min.js" ></script>
<script src="http://localhost:8080/CommunityWeb/js/comm.js"></script>
<script type="text/javascript"></script>
<style type="text/css">
body {
    margin-top: 10px;
    margin-bottom: 50px;
	background-image: url("http://localhost:8080/CommunityWeb/images/bj709.jpg");
    background-size:100% 100%;
    background-color: rgba(255,255,255,0.4);
}
</style>
</head>
<body>
    <ul id="starlist">
        <li><a href="http://localhost:8080/CommunityWeb">首页</a></li>
        <li><a href="list.html">个人文章</a></li>
        <li><a href="about.html">关于我</a></li>
    </ul>
<form class="layui-form" action="http://localhost:8080/CommunityWeb/LeavemessageController/intoLm">
  <div class="layui-form-item" style="margin-left: 50%">
    <label class="layui-form-label">留言内容</label>
    <div class="layui-input-block" style="width: 50%;">
      <input type="text" name="leavemessageContent" required  lay-verify="required" placeholder="请输入留言内容" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item" style="margin-left: 50%">
    <label class="layui-form-label">描述</label>
    <div class="layui-input-inline" style="width: 50%;">
      <input type="text" name="leavemessageDescr" required lay-verify="required" placeholder="请输入描述" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item layui-form-text" style="margin-left: 50%">
    <label class="layui-form-label"><font color="#rrr">内心独白</font></label>
    <div class="layui-input-block" style="width: 50%;">
      <textarea name="leavemessageExperience" placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>
  <div class="layui-form-item" style="margin-left: 50%">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>

<hr style="height:8px;border:none;border-top: 10px ridge skyblue;" />

<div style="margin-left: 30px; margin-right: 30px;">
<c:forEach items="${Leave }" var="foru">
    <h5 class="blogtitle">
      <a href="/" target="_blank">${foru.leavemessageContent}</a>
    </h5>
   <br>
    <p class="bloginfo">
      <i class="avatar"><img src="http://localhost:8080/CommunityWeb/images/avatar.jpg"></i>
      <span></span>
      <span><fmt:formatDate value="${foru.leavemessageTime }" pattern="yy-MM-dd hh:mm:ss"/></span>
      <span>【<a href="/">原创模板</a>】</span>
    </p>
    <p>------------------------------------------------------------------------</p>
</c:forEach>

</div>














<script>
//Demo
layui.use('form', function(){
  var form = layui.form;
  
  //监听提交
  form.on('submit(formDemo)', function(data){
    layer.msg(JSON.stringify(data.field));
    return false;
  });
});
</script>


</body>
</html>