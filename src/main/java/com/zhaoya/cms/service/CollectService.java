package com.zhaoya.cms.service;

import com.github.pagehelper.PageInfo;
import com.zhaoya.cms.domain.Collect;

public interface CollectService {

	/**
	 * 
	 * @Title: insert 
	 * @Description: 收藏
	 * @param collect
	 * @return
	 * @return: int
	 */
	int insert(Collect collect);
	/**
	 * 
	 * @Title: delete 
	 * @Description: 取消收藏
	 * @param id
	 * @return
	 * @return: int
	 */
	int delete(Integer id);
	/**
	 * 
	 * @Title: selects 
	 * @Description: 显示我的收藏夹
	 * @param userId
	 * @param page
	 * @param pageSize
	 * @return
	 * @return: PageInfo<Collect>
	 */
	PageInfo<Collect> selects(Integer userId,Integer page,Integer pageSize);
	
	
	/**
	 * 
	 * @Title: selectByUrlAndUserId 
	 * @Description: 根据url和userid 查询此文章是否被该用户收藏过
	 * @param url
	 * @param userId
	 * @return
	 * @return: Collect
	 */
	Collect selectByTitleAndUserId(String title,Integer userId);
	
}
