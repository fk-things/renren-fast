package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-02 17:37:26
 */
@TableName("bs_product")
public class BsProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 物料编码
	 */
	private String productCd;
	/**
	 * 品牌
	 */
	private String brand;
	/**
	 * 型号
	 */
	private String style;
	/**
	 * 色号
	 */
	private String colorCd;
	/**
	 * 年份
	 */
	private String year;
	/**
	 * 总部库存
	 */
	private Long stock;
	/**
	 * 代理商库存
	 */
	private Long agentStock;
	/**
	 * 安全库存
	 */
	private Long safetyStock;
	/**
	 * 是否定制
	 */
	private String isCm;
	/**
	 * 备注
	 */
	private String remark;
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
	 * 参数5
	 */
	private String parameter5;
	/**
	 * 参数6
	 */
	private String parameter6;
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
	 * 设置：物料编码
	 */
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	/**
	 * 获取：物料编码
	 */
	public String getProductCd() {
		return productCd;
	}
	/**
	 * 设置：品牌
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * 获取：品牌
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * 设置：型号
	 */
	public void setStyle(String style) {
		this.style = style;
	}
	/**
	 * 获取：型号
	 */
	public String getStyle() {
		return style;
	}
	/**
	 * 设置：色号
	 */
	public void setColorCd(String colorCd) {
		this.colorCd = colorCd;
	}
	/**
	 * 获取：色号
	 */
	public String getColorCd() {
		return colorCd;
	}
	/**
	 * 设置：年份
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * 获取：年份
	 */
	public String getYear() {
		return year;
	}
	/**
	 * 设置：总部库存
	 */
	public void setStock(Long stock) {
		this.stock = stock;
	}
	/**
	 * 获取：总部库存
	 */
	public Long getStock() {
		return stock;
	}
	/**
	 * 设置：代理商库存
	 */
	public void setAgentStock(Long agentStock) {
		this.agentStock = agentStock;
	}
	/**
	 * 获取：代理商库存
	 */
	public Long getAgentStock() {
		return agentStock;
	}
	/**
	 * 设置：安全库存
	 */
	public void setSafetyStock(Long safetyStock) {
		this.safetyStock = safetyStock;
	}
	/**
	 * 获取：安全库存
	 */
	public Long getSafetyStock() {
		return safetyStock;
	}
	/**
	 * 设置：是否定制
	 */
	public void setIsCm(String isCm) {
		this.isCm = isCm;
	}
	/**
	 * 获取：是否定制
	 */
	public String getIsCm() {
		return isCm;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
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
	 * 设置：参数5
	 */
	public void setParameter5(String parameter5) {
		this.parameter5 = parameter5;
	}
	/**
	 * 获取：参数5
	 */
	public String getParameter5() {
		return parameter5;
	}
	/**
	 * 设置：参数6
	 */
	public void setParameter6(String parameter6) {
		this.parameter6 = parameter6;
	}
	/**
	 * 获取：参数6
	 */
	public String getParameter6() {
		return parameter6;
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
