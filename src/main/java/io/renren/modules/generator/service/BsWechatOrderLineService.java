package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.BsWechatOrderLineEntity;

import java.util.Map;

/**
 * 微店订单明细
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-16 10:09:51
 */
public interface BsWechatOrderLineService extends IService<BsWechatOrderLineEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

