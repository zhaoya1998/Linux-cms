package com.zhaoya.cms.service;

import com.github.pagehelper.PageInfo;
import com.zhaoya.cms.domain.Article;

public interface ArticleService {

	/**
	 * 
	 * @Title: selects 
	 * @Description: 文章的列表
	 * @param article
	 * @return
	 * @return: List<Article>
	 */
	PageInfo<Article> selects(Article article,Integer page,Integer pageSize);
	
	/**
	 * 
	 * @Title: update 
	 * @Description: 更新文章
	 * @param article
	 * @return
	 * @return: int
	 */
	boolean update(Article article);
	
	
	/**
	 * 
	 * @Title: select 
	 * @Description: 根据id 查询文章内容
	 * @param id
	 * @return
	 * @return: Article
	 */
	Article select(Integer id);
	
	/**
	 * 
	 * @Title: insert 
	 * @Description: 增加文章
	 * @param article
	 * @return
	 * @return: int
	 */
	boolean insert(Article article);
}
