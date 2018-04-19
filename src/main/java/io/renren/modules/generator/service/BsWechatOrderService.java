package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.BsWechatOrderEntity;

import java.util.Map;

/**
 * 微店订单
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-16 10:09:51
 */
public interface BsWechatOrderService extends IService<BsWechatOrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

