package com.songhj.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.songhj.foundation.UserFacadeService;


@Service
@com.alibaba.dubbo.config.annotation.Service(protocol = { "dubbo" }, timeout = 600000, retries = -1)
public class UserService implements UserFacadeService{

	@Override
	public List<String> userList() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("胡歌");
		list.add("霍建华");
		return list;
	}

}
