package io.renren.modules.generator.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.generator.entity.BsWechatShopEntity;
import io.renren.modules.generator.service.BsWechatShopService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 微店
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-16 14:04:10
 */
@RestController
@RequestMapping("generator/bswechatshop")
public class BsWechatShopController {
    @Autowired
    private BsWechatShopService bsWechatShopService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:bswechatshop:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bsWechatShopService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:bswechatshop:info")
    public R info(@PathVariable("id") Long id){
			BsWechatShopEntity bsWechatShop = bsWechatShopService.selectById(id);

        return R.ok().put("bsWechatShop", bsWechatShop);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:bswechatshop:save")
    public R save(@RequestBody BsWechatShopEntity bsWechatShop){
			bsWechatShopService.insert(bsWechatShop);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:bswechatshop:update")
    public R update(@RequestBody BsWechatShopEntity bsWechatShop){
			bsWechatShopService.updateById(bsWechatShop);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:bswechatshop:delete")
    public R delete(@RequestBody Long[] ids){
			bsWechatShopService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
