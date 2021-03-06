<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>论坛问答</title>

<link href="http://localhost:8080/CommunityWeb/css/base.css" rel="stylesheet">
<link href="http://localhost:8080/CommunityWeb/css/m.css" rel="stylesheet">

<script src="http://localhost:8080/CommunityWeb/js/jquery-1.8.3.min.js" ></script>
<script src="http://localhost:8080/CommunityWeb/js/comm.js"></script>
<style type="text/css">
.ContentItem-action{
float: left;
margin-left: 20px;
}

.biaoqian{
margin-left: 40px;
font-size: 18px;
font-weight: 300;
}
.huida{
margin-right: 50px;
}

</style>

</head>
<body>
<!--top begin-->
<header id="header">
  <div class="navbox">
    <h2 id="mnavh"><span class="navicon"></span></h2>
    <div class="logo"><a href="#">你问我答</a></div>
    <nav>
      <ul id="starlist">
        <li><a href="http://localhost:8080/CommunityWeb/">首页</a></li>
        <li><a href="list.html">个人文章</a></li>
        <li><a href="about.html">关于我</a></li>
      </ul>
    </nav>
    <div class="searchico"></div>
  </div>
</header>
<div class="searchbox">
  <div class="search">
    <form action="/e/search/index.php" method="post" name="searchform" id="searchform">
      <input name="keyboard" id="keyboard" class="input_text" value="请输入关键字词" style="color: rgb(153, 153, 153);" onFocus="if(value=='请输入关键字词'){this.style.color='#000';value=''}" onBlur="if(value==''){this.style.color='#999';value='请输入关键字词'}" type="text">
      <input name="show" value="title" type="hidden">
      <input name="tempid" value="1" type="hidden">
      <input name="tbname" value="news" type="hidden">
      <input name="Submit" class="input_submit" value="搜索" type="submit">
    </form>
  </div>
  <div class="searchclose"></div>
</div>
<!--top end-->
<article> 
  <!--lbox begin-->
  <div class="lbox">
    <div class="whitebg lanmu" > <img src="http://localhost:8080/CommunityWeb/images/2.jpg">
      <h1>论坛问答</h1>
      <p>一个问题，百万回答。</p>
    </div>
    <div class="whitebg bloglist">
      <a class="biaoqian" href="http://localhost:8080/CommunityWeb/ForumController/views?type=forum_time">最新提问</a>    <a class="biaoqian" href="http://localhost:8080/CommunityWeb/ForumController/views?type=forum_pageviews">热点提问</a>    <a class="biaoqian" href="http://localhost:8080/CommunityWeb/ForumController/views?type=forum_commentvolume">热议提问</a>
      <p>=============================================================</p>
      <ul>
        <c:forEach items="${forumss }" var="foru">
        <li>
          <h1 class="blogtitle" style="font-size: 27px;"><a href="http://localhost:8080/CommunityWeb/ForumController/intoForum?forum_id=${foru.forumId }" target="_blank">${foru.forumContent}</a></h1>
          <%int i=1; %>
          <c:forEach items="${foru.forumresponse}" var="resp">
           <p class="blogtext"><h3><%=i++ %>:${resp.forumresponseContent }</h3></p>
          </c:forEach>
          <p class="bloginfo"><i class="avatar"><img src="/images/avatar.jpg"></i><span>${foru.users.usersName }</span>
          <span><fmt:formatDate value="${foru.forumTime }" pattern="yy-MM-dd hh:mm:ss"/></span><span>【<a href="/">${foru.forumType }</a>】</span></p>
          <a onclick="huida(${foru.forumId})" class="viewmore">去回答</a>
          
          <div class="ContentItem-actions">
          
          <button type="button" class="Button ContentItem-action Button--plain Button--withIcon Button--withLabel" style="background-color: white; border-style: none;">
          <span style="display:inline-flex;align-items:center">​
          <svg class="Zi Zi--Comment Button-zi" fill="currentColor" viewBox="0 0 24 24" width="1.2em" height="1.2em">
          <path d="M10.241 19.313a.97.97 0 0 0-.77.2 7.908 7.908 0 0 1-3.772 1.482.409.409 0 0 1-.38-.637 5.825 5.825 0 0 0 1.11-2.237.605.605 0 0 0-.227-.59A7.935 7.935 0 0 1 3 11.25C3 6.7 7.03 3 12 3s9 3.7 9 8.25-4.373 9.108-10.759 8.063z" fill-rule="evenodd">
          </path></svg></span> ${foru.forumCommentvolume } 条回答</button>
          
          <div class="Popover ShareMenu ContentItem-action">
          <div class="ShareMenu-toggler" id="null-toggle" aria-haspopup="true" aria-expanded="false" aria-owns="null-content">
          <button type="button" class="Button Button--plain Button--withIcon Button--withLabel" style="background-color: white; border-style: none;">
          <span style="display:inline-flex;align-items:center">
          ​<svg class="Zi Zi--Share Button-zi" fill="currentColor" viewBox="0 0 24 24" width="1.2em" height="1.2em">
          <path d="M2.931 7.89c-1.067.24-1.275 1.669-.318 2.207l5.277 2.908 8.168-4.776c.25-.127.477.198.273.39L9.05 14.66l.927 5.953c.18 1.084 1.593 1.376 2.182.456l9.644-15.242c.584-.892-.212-2.029-1.234-1.796L2.93 7.89z" fill-rule="evenodd">
          </path></svg>
          </span>分享</button>
          </div></div>
          
          <button type="button" class="Button ContentItem-action Button--plain Button--withIcon Button--withLabel" style="background-color: white; border-style: none;">
          <span style="display:inline-flex;align-items:center">
          ​<svg class="Zi Zi--Star Button-zi" fill="currentColor" viewBox="0 0 24 24" width="1.2em" height="1.2em">
          <path d="M5.515 19.64l.918-5.355-3.89-3.792c-.926-.902-.639-1.784.64-1.97L8.56 7.74l2.404-4.871c.572-1.16 1.5-1.16 2.072 0L15.44 7.74l5.377.782c1.28.186 1.566 1.068.64 1.97l-3.89 3.793.918 5.354c.219 1.274-.532 1.82-1.676 1.218L12 18.33l-4.808 2.528c-1.145.602-1.896.056-1.677-1.218z" fill-rule="evenodd">
          </path></svg>
          </span>收藏</button>
          
          <button type="button" class="Button ContentItem-action Button--plain Button--withIcon Button--withLabel" style="background-color: white; border-style: none;">
          <span style="display:inline-flex;align-items:center">
          ​<svg class="Zi Zi--Heart Button-zi" fill="currentColor" viewBox="0 0 24 24" width="1.2em" height="1.2em">
          <path d="M2 8.437C2 5.505 4.294 3.094 7.207 3 9.243 3 11.092 4.19 12 6c.823-1.758 2.649-3 4.651-3C19.545 3 22 5.507 22 8.432 22 16.24 13.842 21 12 21 10.158 21 2 16.24 2 8.437z" fill-rule="evenodd">
          </path>
          </svg>
          </span>浏览量 ${foru.forumPageviews }</button>
          
        </li>
        </c:forEach>
        
      </ul>
      
      <!--pagelist-->
<!--       <div class="pagelist"><a title="Total record">&nbsp;<b>67</b> </a>&nbsp;&nbsp;&nbsp;<b>1</b>&nbsp;<a href="/download/index_2.html">2</a>&nbsp;<a href="/download/index_3.html">3</a>&nbsp;<a href="/download/index_2.html">下一页</a>&nbsp;<a href="/download/index_3.html">尾页</a></div>
 -->      <!--pagelist end--> 
    </div>
    
    <!--bloglist end--> 
  </div>
  <div class="rbox">
    <div class="whitebg paihang">
      <h2 class="htitle">点击排行</h2>
      <section class="topnews imgscale"><a href="/"><img src="/images/h1.jpg"><span>6条网页设计配色原则,让你秒变配色高手</span></a></section>
      <ul>
        <li><i></i><a href="/">十条设计原则教你学会如何设计网页布局!</a></li>
        <li><i></i><a href="/">用js+css3来写一个手机栏目导航</a></li>
        <li><i></i><a href="/">6条网页设计配色原则,让你秒变配色高手</a></li>
        <li><i></i><a href="/">三步实现滚动条触动css动画效果</a></li>
        <li><i></i><a href="/">个人博客，属于我的小世界！</a></li>
        <li><i></i><a href="/">安静地做一个爱设计的女子</a></li>
        <li><i></i><a href="/">个人网站做好了，百度不收录怎么办？来，看看他们怎么做的。</a></li>
        <li><i></i><a href="/">做个人博客如何用帝国cms美化留言增加头像选择</a></li>
      </ul>
    </div>
    <div class="whitebg tuijian">
      <h2 class="htitle">本栏推荐</h2>
      <section class="topnews imgscale"><a href="/"><img src="http://localhost:8080/CommunityWeb/images/h2.jpg"><span>6条网页设计配色原则,让你秒变配色高手</span></a></section>
      <ul>
        <li><a href="/"><i><img src="http://localhost:8080/CommunityWeb/images/text01.jpg"></i>
          <p>十条设计原则教你学会如何设计网页布局!</p>
          </a></li>
        <li><a href="/"><i><img src="http://localhost:8080/CommunityWeb/images/text02.jpg"></i>
          <p>用js+css3来写一个手机栏目导航</p>
          </a></li>
        <li><a href="/"><i><img src="http://localhost:8080/CommunityWeb/images/text03.jpg"></i>
          <p>6条网页设计配色原则,让你秒变配色高手</p>
          </a></li>
        <li><a href="/"><i><img src="http://localhost:8080/CommunityWeb/images/text04.jpg"></i>
          <p>三步实现滚动条触动css动画效果</p>
          </a></li>
        <li><a href="/"><i><img src="http://localhost:8080/CommunityWeb/images/text05.jpg"></i>
          <p>个人博客，属于我的小世界！</p>
          </a></li>
        <li><a href="/"><i><img src="http://localhost:8080/CommunityWeb/images/text06.jpg"></i>
          <p>安静地做一个爱设计的女子</p>
          </a></li>
        <li><a href="/"><i><img src="http://localhost:8080/CommunityWeb/images/text07.jpg"></i>
          <p>个人网站做好了，百度不收录怎么办？来，看看他们怎么做的。</p>
          </a></li>
      </ul>
    </div>
    <div class="ad whitebg imgscale">
      <ul>
        <a href="/"><img src="http://localhost:8080/CommunityWeb/images/ad.jpg"></a>
      </ul>
    </div>
   
    <div class="whitebg tongji">
      <h2 class="htitle">站点信息</h2>
      <ul>
        <li><b>建站时间</b>：2018-10-24</li>
        <li><b>网站程序</b>：帝国cms</li>
        <li><b>主题模板</b>：<a href="http://www.yangqq.com" target="_blank">《今夕何夕》</a></li>
        <li><b>文章统计</b>：299条</li>
        <li><b>文章评论</b>：490条</li>
        <li><b>统计数据</b>：<a href="/">百度统计</a></li>
      </ul>
    </div>
  </div>
</article>
<footer>
  <div class="box">
    <div class="wxbox">
      <ul>
        <li><img src="http://localhost:8080/CommunityWeb/images/wxgzh.jpg"><span>微信公众号</span></li>
        <li><img src="http://localhost:8080/CommunityWeb/images/wx.png"><span>我的微信</span></li>
      </ul>
    </div>
    <div class="endnav">
      <p><b>站点声明：</b></p>
      <p>1、本站个人博客模板，均为杨青青本人设计，个人可以使用，但是未经许可不得用于任何商业目的。</p>
      <p>2、所有文章未经授权禁止转载、摘编、复制或建立镜像，如有违反，追究法律责任。举报邮箱：<a href="http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&email=HHh9cn95b3F1cHVye1xtbTJ-c3E" target="_blank">dacesmiling@qq.com</a></p>
      <p>Copyright © <a href="/" target="_blank">千峰</a> All Rights Reserved. 备案号：<a href="http://www.miitbeian.gov.cn/" target="_blank">蜀ICP备11002373号-1</a></p>
    </div>
  </div>
  <a href="#">
  <div class="top"></div>
  </a> 
</footer>

<script>
function huida(fid) {
	var forumresponseContent = prompt("输入你的回答：");
	//alert(forumresponseContent+"---"+fid);  
	
	location.href="/ForumRespController/intoforumResp?forumId="+fid+"&forumresponseContent="+forumresponseContent;
	
	/* $.ajax({
		type:"get",
		url:"/ForumRespController/intoforumResp",
		contentType:"application/json;charset=utf-8",
		async:false,
        data:JSON.stringify({
            forumId:fid,
            forumresponseContent:forumresponseContent
        }),
        success:function (message) {
            console.log(message);
        }
	}); */

}

<%-- <c:forEach items="${forumss }" var="foru">
   <h1 class="blogtitle" style="font-size: 27px;">
      <a href="/ForumController/intoForum?forum_id=${foru.forumId }" target="_blank">${foru.forumContent}</a>
   </h1>
   <%int i=1; %>
   <c:forEach items="${foru.forumresponse}" var="resp">
      <p class="blogtext"><h3><%=i++ %>:${resp.forumresponseContent }</h3></p>
   </c:forEach>
   <p class="bloginfo">
     <i class="avatar"><img src="http://localhost:8088/images/avatar.jpg"></i>
     <span>${foru.users.usersName }</span>
     <span><fmt:formatDate value="${foru.forumTime }" pattern="yy-MM-dd hh:mm:ss"/></span>
     <span>【<a href="/">${foru.forumType }</a>】</span>
   </p>
   <a onclick="huida()" class="viewmore">去回答</a>
   --%>
</script>


</body>
</html>
