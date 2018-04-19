package io.renren.modules.weidian.sdk.response.product;

import io.renren.modules.weidian.sdk.entity.Sku;
import io.renren.modules.weidian.sdk.response.AbstractResponse;

public class CommonSkuResponse extends AbstractResponse {

  private Sku[] result;

  public Sku[] getResult() {
    return result;
  }

  public void setResult(Sku[] result) {
    this.result = result;
  }

}
