package io.renren.modules.generator.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.generator.entity.BsProductEntity;
import io.renren.modules.generator.service.BsProductService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 产品
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-02 17:37:26
 */
@RestController
@RequestMapping("generator/bsproduct")
public class BsProductController {
    @Autowired
    private BsProductService bsProductService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:bsproduct:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bsProductService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:bsproduct:info")
    public R info(@PathVariable("id") Long id){
			BsProductEntity bsProduct = bsProductService.selectById(id);

        return R.ok().put("bsProduct", bsProduct);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:bsproduct:save")
    public R save(@RequestBody BsProductEntity bsProduct){
			bsProductService.insert(bsProduct);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:bsproduct:update")
    public R update(@RequestBody BsProductEntity bsProduct){
			bsProductService.updateById(bsProduct);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:bsproduct:delete")
    public R delete(@RequestBody Long[] ids){
			bsProductService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
