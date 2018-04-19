package io.renren.modules.weidian.sdk.response;

import io.renren.modules.weidian.sdk.exception.OpenException;
import io.renren.modules.weidian.sdk.util.JsonUtils;

public abstract class AbstractResponse {

  protected Status status;

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public String toString() {
    try {
      return JsonUtils.toJson(this);
    } catch (OpenException e) {
      e.printStackTrace();
      return null;
    }
  }

}
