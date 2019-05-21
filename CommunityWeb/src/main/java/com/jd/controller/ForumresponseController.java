package com.jd.controller;

import static org.hamcrest.CoreMatchers.not;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.jd.pojo.Forum;
import com.jd.pojo.ForumExample;
import com.jd.pojo.Forumresponse;
import com.jd.pojo.ForumresponseExample;
import com.jd.service.ForumService;
import com.jd.service.ForumresponseService;

@Controller
@RequestMapping("/ForumRespController")
public class ForumresponseController {
	
	@Autowired
	private ForumresponseService forumresponseService;
	@Autowired
	private ForumService forumService;
	
	private ForumresponseExample example;
	
	@GetMapping("/testForumresponse")
	@ResponseBody
	public List<Forumresponse> getForumresponse(){
		return forumresponseService.selectByExample(null);
	}

	
	@GetMapping("/intoforumResp")
	public String insertForumResp(@RequestParam("forumId") Integer forumId,@RequestParam("forumresponseContent") String forumresponseContent) throws UnsupportedEncodingException{
		if(forumresponseContent == "" || forumresponseContent == null ){
			return "redirect:/ForumController/getForums";
		} else {
		Forumresponse record = new Forumresponse();
		record.setForumId(forumId);
		record.setForumresponseContent(new String(forumresponseContent.getBytes("ISO-8859-1"),"utf-8"));
		record.setForumresponseTime(new Date());
		forumresponseService.insertSelective(record);
		
		Forum forum = forumService.selectByPrimaryKey(forumId);
		Integer sum = forum.getForumCommentvolume();
		Forum forecord = new Forum();
		forecord.setForumId(forumId);
		forecord.setForumCommentvolume(sum+1);
		forumService.updateByPrimaryKeySelective(forecord);
		
		return "redirect:/ForumController/getForums";
		}
	}
}
