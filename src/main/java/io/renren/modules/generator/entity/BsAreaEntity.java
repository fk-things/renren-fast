package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 地区
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-08 08:54:47

 */
@TableName("bs_area")
public class BsAreaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 地区编码
	 */
	private String areaCd;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 上级ID
	 */
	private String parentId;
	/**
	 * 上级ID
	 */
	private String levels;
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
	 * 设置：地区编码
	 */
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}
	/**
	 * 获取：地区编码
	 */
	public String getAreaCd() {
		return areaCd;
	}
	/**
	 * 设置：上级ID
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：上级ID
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：上级ID
	 */
	public void setLevels(String levels) {
		this.levels = levels;
	}
	/**
	 * 获取：上级ID
	 */
	public String getLevels() {
		return levels;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Boolean leaf;

	public Boolean getLeaf() {
		return leaf;
	}

	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}
}
