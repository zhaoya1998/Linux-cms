package com.zhaoya.cms.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.zhaoya.cms.domain.User;
import com.zhaoya.cms.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class UserServiceImplTest {
	@Resource
	UserService userService;

	@Test
	public void testSelects() {
		PageInfo<User> info = userService.selects(null, 1, 10);
		System.out.println(info);
	}

}
