package io.renren.modules.weidian.sdk.response.product;

import io.renren.modules.weidian.sdk.entity.Item;
import io.renren.modules.weidian.sdk.response.AbstractResponse;

public class CommonItemResponse extends AbstractResponse {

  private Item result;

  public Item getResult() {
    return result;
  }

  public void setResult(Item result) {
    this.result = result;
  }

}
