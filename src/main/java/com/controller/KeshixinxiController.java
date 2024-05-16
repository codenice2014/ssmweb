package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KeshixinxiEntity;
import com.entity.view.KeshixinxiView;

import com.service.KeshixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 科室信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@RestController
@RequestMapping("/keshixinxi")
public class KeshixinxiController {
    @Autowired
    private KeshixinxiService keshixinxiService;



    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KeshixinxiEntity keshixinxi, 
		HttpServletRequest request){

        EntityWrapper<KeshixinxiEntity> ew = new EntityWrapper<KeshixinxiEntity>();


		PageUtils page = keshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, keshixinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KeshixinxiEntity keshixinxi, 
		HttpServletRequest request){
        EntityWrapper<KeshixinxiEntity> ew = new EntityWrapper<KeshixinxiEntity>();

		PageUtils page = keshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, keshixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KeshixinxiEntity keshixinxi){
       	EntityWrapper<KeshixinxiEntity> ew = new EntityWrapper<KeshixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( keshixinxi, "keshixinxi")); 
        return R.ok().put("data", keshixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KeshixinxiEntity keshixinxi){
        EntityWrapper< KeshixinxiEntity> ew = new EntityWrapper< KeshixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( keshixinxi, "keshixinxi")); 
		KeshixinxiView keshixinxiView =  keshixinxiService.selectView(ew);
		return R.ok("查询科室信息成功").put("data", keshixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KeshixinxiEntity keshixinxi = keshixinxiService.selectById(id);
		keshixinxi.setClicknum(keshixinxi.getClicknum()+1);
		keshixinxi.setClicktime(new Date());
		keshixinxiService.updateById(keshixinxi);
        return R.ok().put("data", keshixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KeshixinxiEntity keshixinxi = keshixinxiService.selectById(id);
		keshixinxi.setClicknum(keshixinxi.getClicknum()+1);
		keshixinxi.setClicktime(new Date());
		keshixinxiService.updateById(keshixinxi);
        return R.ok().put("data", keshixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KeshixinxiEntity keshixinxi, HttpServletRequest request){
    	keshixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(keshixinxi);

        keshixinxiService.insert(keshixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KeshixinxiEntity keshixinxi, HttpServletRequest request){
    	keshixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(keshixinxi);

        keshixinxiService.insert(keshixinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KeshixinxiEntity keshixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(keshixinxi);
        keshixinxiService.updateById(keshixinxi);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        keshixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,KeshixinxiEntity keshixinxi, HttpServletRequest request,String pre){
        EntityWrapper<KeshixinxiEntity> ew = new EntityWrapper<KeshixinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = keshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, keshixinxi), params), params));
        return R.ok().put("data", page);
    }









}
