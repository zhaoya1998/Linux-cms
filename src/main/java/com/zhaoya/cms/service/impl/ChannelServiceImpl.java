package com.zhaoya.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhaoya.cms.dao.ChannelMapper;
import com.zhaoya.cms.domain.Category;
import com.zhaoya.cms.domain.Channel;
import com.zhaoya.cms.service.ChannelService;
import com.zhaoya.common.untils.RandomUtil;

@Service
public class ChannelServiceImpl implements ChannelService {
@Resource
private ChannelMapper channelMapper;
	@Override
	public List<Channel> selects() {
		
		return channelMapper.selects();
	}

	@Override
	public List<Category> selectsByCid(Integer channelId) {
		return channelMapper.selectsByCid(channelId);
	}
	
	@Override
	public Integer getRandomChannelId() {
		List<Integer> channelIdList = channelMapper.selectChannelIdList();
		int random = RandomUtil.random(0, channelIdList.size()-1);
		return channelIdList.get(random);
	}

	@Override
	public Integer getRandomCateId(Integer channelId) {
		List<Integer> cateIdList = channelMapper.selectCateIdList(channelId);
		int random = RandomUtil.random(0, cateIdList.size()-1);
		return cateIdList.get(random);
	}

}
