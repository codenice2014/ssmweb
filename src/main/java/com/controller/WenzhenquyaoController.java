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

import com.entity.WenzhenquyaoEntity;
import com.entity.view.WenzhenquyaoView;

import com.service.WenzhenquyaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 问诊取药
 * 后端接口
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@RestController
@RequestMapping("/wenzhenquyao")
public class WenzhenquyaoController {
    @Autowired
    private WenzhenquyaoService wenzhenquyaoService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenzhenquyaoEntity wenzhenquyao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wenzhenquyao.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yisheng")) {
			wenzhenquyao.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peizhenyuan")) {
			wenzhenquyao.setPeizhenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WenzhenquyaoEntity> ew = new EntityWrapper<WenzhenquyaoEntity>();


		PageUtils page = wenzhenquyaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhenquyao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenzhenquyaoEntity wenzhenquyao, 
		HttpServletRequest request){
        EntityWrapper<WenzhenquyaoEntity> ew = new EntityWrapper<WenzhenquyaoEntity>();

		PageUtils page = wenzhenquyaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhenquyao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenzhenquyaoEntity wenzhenquyao){
       	EntityWrapper<WenzhenquyaoEntity> ew = new EntityWrapper<WenzhenquyaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenzhenquyao, "wenzhenquyao")); 
        return R.ok().put("data", wenzhenquyaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenzhenquyaoEntity wenzhenquyao){
        EntityWrapper< WenzhenquyaoEntity> ew = new EntityWrapper< WenzhenquyaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenzhenquyao, "wenzhenquyao")); 
		WenzhenquyaoView wenzhenquyaoView =  wenzhenquyaoService.selectView(ew);
		return R.ok("查询问诊取药成功").put("data", wenzhenquyaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenzhenquyaoEntity wenzhenquyao = wenzhenquyaoService.selectById(id);
        return R.ok().put("data", wenzhenquyao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenzhenquyaoEntity wenzhenquyao = wenzhenquyaoService.selectById(id);
        return R.ok().put("data", wenzhenquyao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenzhenquyaoEntity wenzhenquyao, HttpServletRequest request){
    	wenzhenquyao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenzhenquyao);

        wenzhenquyaoService.insert(wenzhenquyao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenzhenquyaoEntity wenzhenquyao, HttpServletRequest request){
    	wenzhenquyao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenzhenquyao);

        wenzhenquyaoService.insert(wenzhenquyao);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WenzhenquyaoEntity wenzhenquyao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenzhenquyao);
        wenzhenquyaoService.updateById(wenzhenquyao);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenzhenquyaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
