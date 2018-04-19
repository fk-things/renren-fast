package io.renren.modules.generator.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.generator.dao.BsWechatShopDao;
import io.renren.modules.generator.entity.BsWechatShopEntity;
import io.renren.modules.generator.service.BsWechatShopService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("bsWechatShopService")
public class BsWechatShopServiceImpl extends ServiceImpl<BsWechatShopDao, BsWechatShopEntity> implements BsWechatShopService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BsWechatShopEntity> page = this.selectPage(
                new Query<BsWechatShopEntity>(params).getPage(),
                new EntityWrapper<BsWechatShopEntity>()
        );

        return new PageUtils(page);
    }

}
