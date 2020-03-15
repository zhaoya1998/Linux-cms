package com.zhaoya.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaoya.cms.dao.CollectMapper;
import com.zhaoya.cms.domain.Collect;
import com.zhaoya.cms.service.CollectService;
import com.zhaoya.cms.util.CMSException;
import com.zhaoya.common.untils.StringUtil;

@Service
public class CollectServiceImpl implements CollectService {
	@Resource
	private CollectMapper collectMapper;

	@Override
	public int insert(Collect collect) {
		//判断传入的url是否合法
		if(!StringUtil.isHttpUrl(collect.getUrl())) {
			//不是合法url.抛出异常
			throw new CMSException("不是合法的url");
		}
		
		
		return collectMapper.insert(collect);
	}

	@Override
	public int delete(Integer id) {
		return collectMapper.delete(id);
	}

	@Override
	public PageInfo<Collect> selects(Integer userId, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Collect> list = collectMapper.selects(userId);
		return new PageInfo<Collect>(list);
	}

	@Override
	public Collect selectByTitleAndUserId(String url, Integer userId) {
		return collectMapper.selectByTitleAndUserId(url, userId);
	}

}
