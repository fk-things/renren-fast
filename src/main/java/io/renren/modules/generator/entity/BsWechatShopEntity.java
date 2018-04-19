package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 微店
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-16 14:04:10
 */
@TableName("bs_wechat_shop")
public class BsWechatShopEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 店名
	 */
	private String name;
	/**
	 * APPKEY
	 */
	private String appkey;
	/**
	 * SECRET
	 */
	private String secret;
	/**
	 * 上级ID
	 */
	private String accessToken;
	/**
	 * 参数1
	 */
	private String parameter1;
	/**
	 * 参数2
	 */
	private String parameter2;
	/**
	 * 参数3
	 */
	private String parameter3;
	/**
	 * 参数4
	 */
	private String parameter4;
	/**
	 * 创建者ID
	 */
	private Long createUserId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新者ID
	 */
	private Long updateUserId;
	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：店名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：店名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：APPKEY
	 */
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}
	/**
	 * 获取：APPKEY
	 */
	public String getAppkey() {
		return appkey;
	}
	/**
	 * 设置：SECRET
	 */
	public void setSecret(String secret) {
		this.secret = secret;
	}
	/**
	 * 获取：SECRET
	 */
	public String getSecret() {
		return secret;
	}
	/**
	 * 设置：上级ID
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	/**
	 * 获取：上级ID
	 */
	public String getAccessToken() {
		return accessToken;
	}
	/**
	 * 设置：参数1
	 */
	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}
	/**
	 * 获取：参数1
	 */
	public String getParameter1() {
		return parameter1;
	}
	/**
	 * 设置：参数2
	 */
	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}
	/**
	 * 获取：参数2
	 */
	public String getParameter2() {
		return parameter2;
	}
	/**
	 * 设置：参数3
	 */
	public void setParameter3(String parameter3) {
		this.parameter3 = parameter3;
	}
	/**
	 * 获取：参数3
	 */
	public String getParameter3() {
		return parameter3;
	}
	/**
	 * 设置：参数4
	 */
	public void setParameter4(String parameter4) {
		this.parameter4 = parameter4;
	}
	/**
	 * 获取：参数4
	 */
	public String getParameter4() {
		return parameter4;
	}
	/**
	 * 设置：创建者ID
	 */
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	/**
	 * 获取：创建者ID
	 */
	public Long getCreateUserId() {
		return createUserId;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新者ID
	 */
	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}
	/**
	 * 获取：更新者ID
	 */
	public Long getUpdateUserId() {
		return updateUserId;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
