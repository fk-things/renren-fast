package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 微店订单
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-16 10:09:51
 */
@TableName("bs_wechat_order")
public class BsWechatOrderEntity implements Serializable {
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
	 * 订单状态
	 */
	private String orderStatus;
	/**
	 * 订单总价格(单位 : 分)
	 */
	private String orderTotalPrice;
	/**
	 * 订单创建时间
	 */
	private Date orderCreateTime;
	/**
	 * 订单运费价格(单位 : 分)
	 */
	private String orderExpressPrice;
	/**
	 * 买家微信OPENID
	 */
	private String buyerOpenid;
	/**
	 * 买家微信昵称
	 */
	private String buyerNick;
	/**
	 * 收货人姓名
	 */
	private String receiverName;
	/**
	 * 收货地址省份
	 */
	private String receiverProvince;
	/**
	 * 收货地址城市
	 */
	private String receiverCity;
	/**
	 * 收货地址区/县
	 */
	private String receiverZone;
	/**
	 * 收货详细地址
	 */
	private String receiverAddress;
	/**
	 * 收货人移动电话
	 */
	private String receiverMobile;
	/**
	 * 收货人固定电话
	 */
	private String receiverPhone;
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
	 * 运单ID
	 */
	private String deliveryId;
	/**
	 * 物流公司编码
	 */
	private String deliveryCompany;
	/**
	 * 交易ID
	 */
	private String transId;
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
	 * 设置：订单状态
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 获取：订单状态
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置：订单总价格(单位 : 分)
	 */
	public void setOrderTotalPrice(String orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}
	/**
	 * 获取：订单总价格(单位 : 分)
	 */
	public String getOrderTotalPrice() {
		return orderTotalPrice;
	}
	/**
	 * 设置：订单创建时间
	 */
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}
	/**
	 * 获取：订单创建时间
	 */
	public Date getOrderCreateTime() {
		return orderCreateTime;
	}
	/**
	 * 设置：订单运费价格(单位 : 分)
	 */
	public void setOrderExpressPrice(String orderExpressPrice) {
		this.orderExpressPrice = orderExpressPrice;
	}
	/**
	 * 获取：订单运费价格(单位 : 分)
	 */
	public String getOrderExpressPrice() {
		return orderExpressPrice;
	}
	/**
	 * 设置：买家微信OPENID
	 */
	public void setBuyerOpenid(String buyerOpenid) {
		this.buyerOpenid = buyerOpenid;
	}
	/**
	 * 获取：买家微信OPENID
	 */
	public String getBuyerOpenid() {
		return buyerOpenid;
	}
	/**
	 * 设置：买家微信昵称
	 */
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	/**
	 * 获取：买家微信昵称
	 */
	public String getBuyerNick() {
		return buyerNick;
	}
	/**
	 * 设置：收货人姓名
	 */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	/**
	 * 获取：收货人姓名
	 */
	public String getReceiverName() {
		return receiverName;
	}
	/**
	 * 设置：收货地址省份
	 */
	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}
	/**
	 * 获取：收货地址省份
	 */
	public String getReceiverProvince() {
		return receiverProvince;
	}
	/**
	 * 设置：收货地址城市
	 */
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	/**
	 * 获取：收货地址城市
	 */
	public String getReceiverCity() {
		return receiverCity;
	}
	/**
	 * 设置：收货地址区/县
	 */
	public void setReceiverZone(String receiverZone) {
		this.receiverZone = receiverZone;
	}
	/**
	 * 获取：收货地址区/县
	 */
	public String getReceiverZone() {
		return receiverZone;
	}
	/**
	 * 设置：收货详细地址
	 */
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	/**
	 * 获取：收货详细地址
	 */
	public String getReceiverAddress() {
		return receiverAddress;
	}
	/**
	 * 设置：收货人移动电话
	 */
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	/**
	 * 获取：收货人移动电话
	 */
	public String getReceiverMobile() {
		return receiverMobile;
	}
	/**
	 * 设置：收货人固定电话
	 */
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	/**
	 * 获取：收货人固定电话
	 */
	public String getReceiverPhone() {
		return receiverPhone;
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
	 * 设置：运单ID
	 */
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	/**
	 * 获取：运单ID
	 */
	public String getDeliveryId() {
		return deliveryId;
	}
	/**
	 * 设置：物流公司编码
	 */
	public void setDeliveryCompany(String deliveryCompany) {
		this.deliveryCompany = deliveryCompany;
	}
	/**
	 * 获取：物流公司编码
	 */
	public String getDeliveryCompany() {
		return deliveryCompany;
	}
	/**
	 * 设置：交易ID
	 */
	public void setTransId(String transId) {
		this.transId = transId;
	}
	/**
	 * 获取：交易ID
	 */
	public String getTransId() {
		return transId;
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
