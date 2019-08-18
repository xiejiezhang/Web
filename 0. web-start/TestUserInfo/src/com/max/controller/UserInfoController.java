package com.max.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.max.model.UserInfo;
import com.max.service.UserInfoService;

/**
 * �û���Ϣ������
 * @author jzen
 * 
 */
@Controller
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	/**
	 * ��ѯ���е��û���Ϣ
	 * @param httpRequest
	 * @return
	 */
	@RequestMapping(value="getAllUserInfo.do", produces="application/json;charset=utf-8")
	@ResponseBody
	public ModelAndView getAllUserInfo(HttpServletRequest httpRequest)
	{
		ModelAndView mdv = new ModelAndView();
			
		List<UserInfo> list;
		
		list = userInfoService.getAllUserInfo();
		mdv.addObject("allUserInfo", list);
		mdv.setViewName("list");
		
		return mdv;
	}
		
}
