package io.renren.modules.generator.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.generator.entity.BsAreaEntity;
import io.renren.modules.generator.service.BsAreaService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * 地区
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-08 08:54:47
 */
@RestController
@RequestMapping("generator/bsarea")
public class BsAreaController {
    @Autowired
    private BsAreaService bsAreaService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:bsarea:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bsAreaService.queryPage(params);
        return R.ok().put("page", page);
    }

    /**
     * 选择菜单(添加、修改菜单)
     */
    @GetMapping("/tree/{id}")
    @RequiresPermissions("generator:bsarea:list")
    public R tree(@PathVariable("id") Long id){
        //查询列表数据
        List<BsAreaEntity> areaList = bsAreaService.queryAreaTreeList(id);
        return R.ok().put("areaList", areaList);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:bsarea:info")
    public R info(@PathVariable("id") Long id){
			BsAreaEntity bsArea = bsAreaService.selectById(id);

        return R.ok().put("bsArea", bsArea);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:bsarea:save")
    public R save(@RequestBody BsAreaEntity bsArea){
			bsAreaService.insert(bsArea);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:bsarea:update")
    public R update(@RequestBody BsAreaEntity bsArea){
			bsAreaService.updateById(bsArea);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:bsarea:delete")
    public R delete(@RequestBody Long[] ids){
			bsAreaService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
