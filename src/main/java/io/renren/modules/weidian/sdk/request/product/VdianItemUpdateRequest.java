package io.renren.modules.weidian.sdk.request.product;

import io.renren.modules.weidian.sdk.entity.Item;
import io.renren.modules.weidian.sdk.exception.OpenException;
import io.renren.modules.weidian.sdk.request.AbstractRequest;
import io.renren.modules.weidian.sdk.response.product.CommonItemResponse;
import io.renren.modules.weidian.sdk.util.JsonUtils;

/**
 * 更新商品信息<br/>
 * <a href="http://wiki.open.weidian.com/index.php?title=%E6%9B%B4%E6%96%B0%E5%95%86%E5%93%81%E4%BF%A1%E6%81%AF">查看接口文档</a>
 * */
public class VdianItemUpdateRequest extends AbstractRequest<CommonItemResponse> {

  private Item item;

  public VdianItemUpdateRequest(String accessToken, Item item) {
    super(accessToken);
    this.item = item;
  }

  @Override
  public String getParam() throws OpenException {
    return JsonUtils.toJson(this.item);
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

}
