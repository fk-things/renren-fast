package io.renren.modules.generator.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.generator.entity.BsWechatOrderLineEntity;
import io.renren.modules.generator.service.BsWechatOrderLineService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 微店订单明细
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-16 10:09:51
 */
@RestController
@RequestMapping("generator/bswechatorderline")
public class BsWechatOrderLineController {
    @Autowired
    private BsWechatOrderLineService bsWechatOrderLineService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:bswechatorderline:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bsWechatOrderLineService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:bswechatorderline:info")
    public R info(@PathVariable("id") Long id){
			BsWechatOrderLineEntity bsWechatOrderLine = bsWechatOrderLineService.selectById(id);

        return R.ok().put("bsWechatOrderLine", bsWechatOrderLine);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:bswechatorderline:save")
    public R save(@RequestBody BsWechatOrderLineEntity bsWechatOrderLine){
			bsWechatOrderLineService.insert(bsWechatOrderLine);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:bswechatorderline:update")
    public R update(@RequestBody BsWechatOrderLineEntity bsWechatOrderLine){
			bsWechatOrderLineService.updateById(bsWechatOrderLine);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:bswechatorderline:delete")
    public R delete(@RequestBody Long[] ids){
			bsWechatOrderLineService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
