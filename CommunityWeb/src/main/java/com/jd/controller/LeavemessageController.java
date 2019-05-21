package com.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jd.pojo.Leavemessage;
import com.jd.service.LeavemessageService;

@Controller
@RequestMapping("/LeavemessageController")
public class LeavemessageController {

	@Autowired
	private LeavemessageService leavemessageService;
	
	@GetMapping("/testLeave")
	@ResponseBody
	public List<Leavemessage> testLeavemessages(){
		return leavemessageService.selectByExample(null);
	}
	
	@GetMapping("/getLeave")
	public String getLeavemessages(Model model){
		model.addAttribute("Leave", leavemessageService.selectByExample(null));
		return "liuyan";
	}
	
	@GetMapping("/intoLm")
	public String insertLm(Leavemessage record){
		leavemessageService.insertSelective(record);
		return "redirect:LeavemessageController/getLeave";
	}
	
}
