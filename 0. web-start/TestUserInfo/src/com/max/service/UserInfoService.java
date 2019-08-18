package com.max.service;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.max.dao.UserInfoMapper;
import com.max.model.UserInfo;

/**
 * �û���Ϣ����
 * @author jzen
 *
 */
@Service
@Transactional
public class UserInfoService {
	@Resource
	private UserInfoMapper userMapper;

	/**
	 * ��ѯ�����û���Ϣ
	 * @return
	 */
	public List<UserInfo> getAllUserInfo() {
		List<UserInfo> list = userMapper.getAllUserInfo();
		return list;
	}
	
	
}
