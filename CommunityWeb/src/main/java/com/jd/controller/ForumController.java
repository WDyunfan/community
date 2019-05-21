package com.jd.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jd.pojo.Forum;
import com.jd.pojo.ForumExample;
import com.jd.pojo.Forumresponse;
import com.jd.pojo.ForumresponseExample;
import com.jd.pojo.ForumresponseExample.Criteria;
import com.jd.service.ForumService;
import com.jd.service.ForumresponseService;


@Controller
@RequestMapping("/ForumController")
public class ForumController {
	
	@Autowired
	private ForumService forumService;
	@Autowired
	private ForumresponseService forumresponseService;
	
	private ForumresponseExample forumresponseExample;
	private ForumExample forumExample;
	
	@GetMapping("/testForum")
	@ResponseBody
	public List<Forum> selectForums(){
		return forumService.selectByExample(null);
	}
	
	
	@GetMapping("/getForums")
	public String getForums(Model model) {
		model.addAttribute("forumss", forumService.selectByExample(null));
		return "forum";
	}
	
	@GetMapping("/views")
	public String views(Model model,HttpServletRequest request){
		
		String type = request.getParameter("type");
		System.out.print(type+"----------------");
		forumExample = new ForumExample();
		
		forumExample.setOrderByClause(" "+type+" desc ");
		
		List<Forum> forumss = forumService.selectByExample(forumExample);
		
		for (Forum forum : forumss) {
			List<Forumresponse> flist = forum.getForumresponse();
			
			
		}
		
		
		
		model.addAttribute("forumss", forumss);
		
		return "forum";
	}
	

	@GetMapping("/intoForum")
	public String selectById(Model model,HttpServletRequest request){
		String forumIdStr = request.getParameter("forum_id");
		int forumId = Integer.parseInt(forumIdStr);
		Forum forum = forumService.selectByPrimaryKey(forumId);
		Integer forumPageviews = forum.getForumPageviews();
		Forum record = new Forum();
		record.setForumId(forumId);
		record.setForumPageviews(forumPageviews+1);
		forumService.updateByPrimaryKeySelective(record);
		forumresponseExample = new ForumresponseExample();
		
		Criteria createCriteria = forumresponseExample.createCriteria();
		
		createCriteria.andForumIdEqualTo(forumId);
		
		List<Forumresponse> selectByExample = forumresponseService.selectByExample(forumresponseExample);
		
		model.addAttribute("forumresponses", selectByExample);
		
		model.addAttribute("iforum", forum);
		return "idforum";
	}
	
	
}
