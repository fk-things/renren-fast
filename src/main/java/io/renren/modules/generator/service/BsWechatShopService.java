package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.BsWechatShopEntity;

import java.util.Map;

/**
 * 微店
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-16 14:04:10
 */
public interface BsWechatShopService extends IService<BsWechatShopEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

