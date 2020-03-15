package com.zhaoya.cms.respository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.zhaoya.cms.domain.Article;

public interface ArticleRepositroy extends ElasticsearchRepository<Article, Integer>{

}
