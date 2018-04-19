package io.renren.modules.weidian.sdk.request.product;

import java.util.HashMap;
import java.util.Map;

import io.renren.modules.weidian.sdk.exception.OpenException;
import io.renren.modules.weidian.sdk.request.AbstractRequest;
import io.renren.modules.weidian.sdk.response.CommonResponse;
import io.renren.modules.weidian.sdk.util.JsonUtils;

/**
 * 取消商品的分类<br/>
 * <a href="http://wiki.open.weidian.com/index.php?title=%E5%8F%96%E6%B6%88%E5%95%86%E5%93%81%E7%9A%84%E5%88%86%E7%B1%BB">查看接口文档</a>
 * */
public class VdianItemCateCancelRequest extends AbstractRequest<CommonResponse> {

  private String itemId;
  private String[] cateIds;

  public VdianItemCateCancelRequest(String accessToken, String itemId, String[] cateIds) {
    super(accessToken);
    this.itemId = itemId;
    this.cateIds = cateIds;
  }

  @Override
  public String getParam() throws OpenException {
    Map<String, Object> map = new HashMap<String, Object>((int) (2 / .75f) + 1);
    map.put("itemid", this.itemId);
    map.put("cate_ids", this.cateIds);
    return JsonUtils.toJson(map);
  }

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public String[] getCateIds() {
    return cateIds;
  }

  public void setCateIds(String[] cateIds) {
    this.cateIds = cateIds;
  }

}
