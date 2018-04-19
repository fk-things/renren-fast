package io.renren.modules.weidian.sdk.response.product;

import io.renren.modules.weidian.sdk.entity.Cate;
import io.renren.modules.weidian.sdk.response.AbstractResponse;

public class VdianShopCateGetResponse extends AbstractResponse {

  private Cate[] result;

  public Cate[] getResult() {
    return result;
  }

  public void setResult(Cate[] result) {
    this.result = result;
  }

}
