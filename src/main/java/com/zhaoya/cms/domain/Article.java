package com.zhaoya.cms.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
/**
 * 
 * @ClassName: Article 
 * @Description: 文章
 * @author: charles
 * @date: 2019年12月10日 下午3:08:27
 */
@Document(indexName="bobocms",type="article")
public class Article implements Serializable {
    /**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Field(store=true,index=false,type=FieldType.Integer)
	private Integer id;
	@Field(store=true,index=true,type=FieldType.Text,analyzer="ik_smart",searchAnalyzer="ik_smart")
    private String title;
	@Field(store=true,index=false,type=FieldType.Text)
    private String picture;
	@Field(store=true,index=false,type=FieldType.Integer)
    private Integer channelId;
	@Field(store=true,index=false,type=FieldType.Integer)
    private Integer categoryId;
	@Field(store=true,index=false,type=FieldType.Integer)
    private Integer userId;
    @Field(store=true,index=true,type=FieldType.Text,analyzer="ik_smart",searchAnalyzer="ik_smart")
	private String content;//文章内容
    @Field(store=true,index=true,type=FieldType.Text,analyzer="ik_smart",searchAnalyzer="ik_smart")
    private String summary;//文章摘要
    @Field(store=true,index=false,type=FieldType.Integer)
    private Integer hits;
    @Field(store=true,index=false,type=FieldType.Integer)
    private Integer hot;
    @Field(store=true,index=false,type=FieldType.Integer)
    private Integer status;
    @Field(store=true,index=false,type=FieldType.Integer)
    private Integer deleted;
    @Field(store=true,index=false,type=FieldType.Date)
    private Date created;
    @Field(store=true,index=false,type=FieldType.Date)
    private Date updated;
    @Field(store=true,index=false,type=FieldType.Integer)
    private Integer contentType;
    @Field(store=true,index=false,type=FieldType.Text)
    private String keywords;
    @Field(store=true,index=false,type=FieldType.Text)
    private String original;
    
    
    
    private User user;//发布人
    private Channel channel;//栏目
    private Category category;//分类

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicture() {
		if(picture!=null && !picture.startsWith("http")) {
			return "/pic/"+picture;
		}
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Integer getContentType() {
		return contentType;
	}

	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

 
    
}