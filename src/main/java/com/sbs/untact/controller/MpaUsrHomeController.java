package com.sbs.untact.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MpaUsrHomeController {
	@RequestMapping("/mpaUsr/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕";
		}

	private int num = 0;

	@RequestMapping("/mpaUsr/home/main1")
	@ResponseBody
	public Map<String, Object> showMain1() {
		
		num++;
		
		Map<String, Object> map = new HashMap<>();
		map.put("숫자", num);
		return map;
		}
}
