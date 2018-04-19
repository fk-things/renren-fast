package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.BsProductEntity;

import java.util.Map;

/**
 * 产品
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-02 17:37:26
 */
public interface BsProductService extends IService<BsProductEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

