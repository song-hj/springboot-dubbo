package com.songhj.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.songhj.foundation.UserFacadeService;

@RestController
public class UserViewController {
	
	@Autowired
	private UserFacadeService userFacadeService;

	@RequestMapping(value="/list", method ={ RequestMethod.GET, RequestMethod.POST } )
	public Map<String, Object> list(HttpServletRequest request,HttpServletResponse response){
		Map<String, Object> map = new HashMap<>();
		map.put("data", userFacadeService.userList());
		return map;
	}
}
