package io.renren.modules.generator.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.generator.dao.BsWechatOrderDao;
import io.renren.modules.generator.entity.BsWechatOrderEntity;
import io.renren.modules.generator.service.BsWechatOrderService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("bsWechatOrderService")
public class BsWechatOrderServiceImpl extends ServiceImpl<BsWechatOrderDao, BsWechatOrderEntity> implements BsWechatOrderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BsWechatOrderEntity> page = this.selectPage(
                new Query<BsWechatOrderEntity>(params).getPage(),
                new EntityWrapper<BsWechatOrderEntity>()
        );

        return new PageUtils(page);
    }

}
