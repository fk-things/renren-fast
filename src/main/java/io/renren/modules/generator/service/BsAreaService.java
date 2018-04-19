package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.BsAreaEntity;

import java.util.List;
import java.util.Map;

/**
 * 地区
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-08 08:54:47
 */
public interface BsAreaService extends IService<BsAreaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    List<BsAreaEntity> queryAreaTreeList(Long id);
}

