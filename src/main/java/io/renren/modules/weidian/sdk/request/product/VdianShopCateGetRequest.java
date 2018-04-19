package io.renren.modules.weidian.sdk.request.product;

import io.renren.modules.weidian.sdk.exception.OpenException;
import io.renren.modules.weidian.sdk.request.AbstractRequest;
import io.renren.modules.weidian.sdk.response.product.VdianShopCateGetResponse;

/**
 * 获取商品分类<br/>
 * <a href="http://wiki.open.weidian.com/index.php?title=%E8%8E%B7%E5%8F%96%E5%95%86%E5%93%81%E5%88%86%E7%B1%BB">查看接口文档</a>
 * */
public class VdianShopCateGetRequest extends AbstractRequest<VdianShopCateGetResponse> {

  public VdianShopCateGetRequest(String accessToken) {
    super(accessToken);
  }

  @Override
  public String getParam() throws OpenException {
    return null;
  }

}
