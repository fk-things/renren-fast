package io.renren.modules.generator.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.renren.modules.generator.entity.BsProductEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-02 17:37:26
 */
@Mapper
public interface BsProductDao extends BaseMapper<BsProductEntity> {
	
}
