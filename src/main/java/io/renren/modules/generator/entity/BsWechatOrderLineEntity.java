package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 微店订单明细
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-16 10:09:51
 */
@TableName("bs_wechat_order_line")
public class BsWechatOrderLineEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 订单ID
	 */
	private String orderId;
	/**
	 * 商品ID
	 */
	private String productId;
	/**
	 * 商品名称
	 */
	private String productName;
	/**
	 * 商品价格(单位 : 分)
	 */
	private String productPrice;
	/**
	 * 商品SKU
	 */
	private String productSku;
	/**
	 * 商品个数
	 */
	private String productCount;
	/**
	 * 商品图片
	 */
	private String productImg;
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
	 * 设置：订单ID
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：订单ID
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * 设置：商品ID
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * 获取：商品ID
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * 设置：商品名称
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * 获取：商品名称
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * 设置：商品价格(单位 : 分)
	 */
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * 获取：商品价格(单位 : 分)
	 */
	public String getProductPrice() {
		return productPrice;
	}
	/**
	 * 设置：商品SKU
	 */
	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}
	/**
	 * 获取：商品SKU
	 */
	public String getProductSku() {
		return productSku;
	}
	/**
	 * 设置：商品个数
	 */
	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}
	/**
	 * 获取：商品个数
	 */
	public String getProductCount() {
		return productCount;
	}
	/**
	 * 设置：商品图片
	 */
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	/**
	 * 获取：商品图片
	 */
	public String getProductImg() {
		return productImg;
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
