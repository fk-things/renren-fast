package io.renren.modules.generator.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.generator.dao.BsWechatOrderLineDao;
import io.renren.modules.generator.entity.BsWechatOrderLineEntity;
import io.renren.modules.generator.service.BsWechatOrderLineService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("bsWechatOrderLineService")
public class BsWechatOrderLineServiceImpl extends ServiceImpl<BsWechatOrderLineDao, BsWechatOrderLineEntity> implements BsWechatOrderLineService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BsWechatOrderLineEntity> page = this.selectPage(
                new Query<BsWechatOrderLineEntity>(params).getPage(),
                new EntityWrapper<BsWechatOrderLineEntity>()
        );

        return new PageUtils(page);
    }

}
