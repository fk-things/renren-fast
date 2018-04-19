package io.renren.modules.generator.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.generator.dao.BsProductDao;
import io.renren.modules.generator.entity.BsProductEntity;
import io.renren.modules.generator.service.BsProductService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("bsProductService")
public class BsProductServiceImpl extends ServiceImpl<BsProductDao, BsProductEntity> implements BsProductService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BsProductEntity> page = this.selectPage(
                new Query<BsProductEntity>(params).getPage(),
                new EntityWrapper<BsProductEntity>()
        );

        return new PageUtils(page);
    }

}
