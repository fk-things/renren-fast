package io.renren.modules.generator.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.generator.entity.BsWechatOrderEntity;
import io.renren.modules.generator.service.BsWechatOrderService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 微店订单
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-16 10:09:51
 */
@RestController
@RequestMapping("generator/bswechatorder")
public class BsWechatOrderController {
    @Autowired
    private BsWechatOrderService bsWechatOrderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:bswechatorder:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bsWechatOrderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:bswechatorder:info")
    public R info(@PathVariable("id") Long id){
			BsWechatOrderEntity bsWechatOrder = bsWechatOrderService.selectById(id);

        return R.ok().put("bsWechatOrder", bsWechatOrder);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:bswechatorder:save")
    public R save(@RequestBody BsWechatOrderEntity bsWechatOrder){
			bsWechatOrderService.insert(bsWechatOrder);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:bswechatorder:update")
    public R update(@RequestBody BsWechatOrderEntity bsWechatOrder){
			bsWechatOrderService.updateById(bsWechatOrder);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:bswechatorder:delete")
    public R delete(@RequestBody Long[] ids){
			bsWechatOrderService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
