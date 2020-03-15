package com.zhaoya.cms.service;

import com.github.pagehelper.PageInfo;
import com.zhaoya.cms.domain.User;

public interface UserService {
	
	
	/**
	 * 
	 * @Title: login 
	 * @Description: 登录
	 * @param user
	 * @return
	 * @return: User
	 */
	User login(User user);

	/**
	 * 
	 * @Title: selectByName 
	 * @Description: TODO
	 * @param name
	 * @return
	 * @return: User
	 */
	User selectByName(String name);

	
	PageInfo<User> selects(User user,Integer page,Integer pageSize);
	
	/**
	 * 
	 * @Title: update 
	 * @Description:修改
	 * @param user
	 * @return
	 * @return: int
	 */
	boolean update(User user);
	
	/**
	 * 
	 * @Title: insert 
	 * @Description: TODO
	 * @param user
	 * @return
	 * @return: 
	 */
	boolean insert(User user);
	

	/**
	 * @Title: getRandomUserId   
	 * @Description: 获取随机用户Id   
	 * @param: @return      
	 * @return: Integer      
	 * @throws
	 */
	Integer getRandomUserId();
}
