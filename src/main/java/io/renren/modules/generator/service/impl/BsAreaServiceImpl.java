package io.renren.modules.generator.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.generator.dao.BsAreaDao;
import io.renren.modules.generator.entity.BsAreaEntity;
import io.renren.modules.generator.service.BsAreaService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("bsAreaService")
public class BsAreaServiceImpl extends ServiceImpl<BsAreaDao, BsAreaEntity> implements BsAreaService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String name = (String)params.get("name");
        String parentId = (String)params.get("parent_Id");
        Page<BsAreaEntity> page = this.selectPage(
                new Query<BsAreaEntity>(params).getPage(),
                new EntityWrapper<BsAreaEntity>()
                        .like(StringUtils.isNotBlank(name), "name", name)
                        .eq(parentId != null, "parent_Id", parentId)
        );
        return new PageUtils(page);

    }
    @Override
    public List<BsAreaEntity> queryAreaTreeList(Long id) {
        return baseMapper.queryAreaTreeList(id);
    }

}
