package io.renren.modules.generator.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.renren.modules.generator.entity.BsAreaEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 地区
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-08 08:54:47
 */
@Mapper
public interface BsAreaDao extends BaseMapper<BsAreaEntity> {
    List<BsAreaEntity> queryAreaTreeList(Long id);
}
