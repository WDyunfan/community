<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>论坛问答</title>

<link href="/css/base.css" rel="stylesheet">
<link href=/css/m.css" rel="stylesheet">

<script src="/js/jquery-1.8.3.min.js" ></script>
<script src="/js/comm.js"></script>
<style type="/text/css">
.ContentItem-action{
float: left;
margin-left: 20px;
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
        <li><a href="/">首页</a></li>
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
    <div class="whitebg lanmu" > <img src="/images/2.jpg">
      <h1>论坛问答</h1>
      <p>一个问题，百万回答。</p>
    </div>
    <div class="whitebg bloglist">
      <h2 class="htitle">回答详情</h2>
      <ul>
        <li>
          <h1 class="blogtitle" style="font-size: 27px;"><a href="/" target="_blank">${iforum.forumContent}</a></h1>
          
          <p class="bloginfo"><i class="avatar">
          <img src="/images/avatar.jpg"></i>
          <span>${iforum.users.usersName }</span>
          <span>${iforum.forumTime }</span>
          <span>【<a href="/">${iforum.forumType }</a>】</span>
          </p>
          <% int i = 1; %>
          <c:forEach items="${forumresponses }" var="resp">
             <p class="blogtext"><h3><%=i++ %>:${resp.forumresponseContent }</h3></p>
             
             <p class="bloginfo"><i class="avatar">
             <img src="/images/avatar.jpg"></i>
             <span>${resp.forumresponseTime }</span>
          </p>
             <p>------------------------------------------------------------------------------------</p>
          </c:forEach>
        </li>
        
      </ul>
      
    </div>
    
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
      <section class="topnews imgscale"><a href="/"><img src="images/h2.jpg"><span>6条网页设计配色原则,让你秒变配色高手</span></a></section>
      <ul>
        <li><a href="/"><i><img src="/images/text01.jpg"></i>
          <p>十条设计原则教你学会如何设计网页布局!</p>
          </a></li>
        <li><a href="/"><i><img src="/images/text02.jpg"></i>
          <p>用js+css3来写一个手机栏目导航</p>
          </a></li>
        <li><a href="/"><i><img src="/images/text03.jpg"></i>
          <p>6条网页设计配色原则,让你秒变配色高手</p>
          </a></li>
        <li><a href="/"><i><img src="/images/text04.jpg"></i>
          <p>三步实现滚动条触动css动画效果</p>
          </a></li>
        <li><a href="/"><i><img src="/images/text05.jpg"></i>
          <p>个人博客，属于我的小世界！</p>
          </a></li>
        <li><a href="/"><i><img src="/images/text06.jpg"></i>
          <p>安静地做一个爱设计的女子</p>
          </a></li>
        <li><a href="/"><i><img src="/images/text07.jpg"></i>
          <p>个人网站做好了，百度不收录怎么办？来，看看他们怎么做的。</p>
          </a></li>
      </ul>
    </div>
    <div class="ad whitebg imgscale">
      <ul>
        <a href="/"><img src="/images/ad.jpg"></a>
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
        <li><img src="/images/wxgzh.jpg"><span>微信公众号</span></li>
        <li><img src="/images/wx.png"><span>我的微信</span></li>
      </ul>
    </div>
    <div class="endnav">
      <p><b>站点声明：</b></p>
      <p>1、本站个人博客模板，均为杨青青本人设计，个人可以使用，但是未经许可不得用于任何商业目的。</p>
      <p>2、所有文章未经授权禁止转载、摘编、复制或建立镜像，如有违反，追究法律责任。举报邮箱：</p>
      <p>Copyright © <a href="http://www.yangqq.com" target="_blank">www.yangqq.com</a> All Rights Reserved. 备案号：<a href="http://www.miitbeian.gov.cn/" target="_blank">蜀ICP备11002373号-1</a></p>
    </div>
  </div>
  <a href="#">
  <div class="top"></div>
  </a> 
</footer>
</body>
</html>
