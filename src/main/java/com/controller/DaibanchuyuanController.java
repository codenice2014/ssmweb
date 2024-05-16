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

import com.entity.DaibanchuyuanEntity;
import com.entity.view.DaibanchuyuanView;

import com.service.DaibanchuyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 代办出院
 * 后端接口
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@RestController
@RequestMapping("/daibanchuyuan")
public class DaibanchuyuanController {
    @Autowired
    private DaibanchuyuanService daibanchuyuanService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DaibanchuyuanEntity daibanchuyuan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			daibanchuyuan.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			daibanchuyuan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peizhenyuan")) {
			daibanchuyuan.setPeizhenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DaibanchuyuanEntity> ew = new EntityWrapper<DaibanchuyuanEntity>();


		PageUtils page = daibanchuyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daibanchuyuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DaibanchuyuanEntity daibanchuyuan, 
		HttpServletRequest request){
        EntityWrapper<DaibanchuyuanEntity> ew = new EntityWrapper<DaibanchuyuanEntity>();

		PageUtils page = daibanchuyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daibanchuyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DaibanchuyuanEntity daibanchuyuan){
       	EntityWrapper<DaibanchuyuanEntity> ew = new EntityWrapper<DaibanchuyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( daibanchuyuan, "daibanchuyuan")); 
        return R.ok().put("data", daibanchuyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DaibanchuyuanEntity daibanchuyuan){
        EntityWrapper< DaibanchuyuanEntity> ew = new EntityWrapper< DaibanchuyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( daibanchuyuan, "daibanchuyuan")); 
		DaibanchuyuanView daibanchuyuanView =  daibanchuyuanService.selectView(ew);
		return R.ok("查询代办出院成功").put("data", daibanchuyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DaibanchuyuanEntity daibanchuyuan = daibanchuyuanService.selectById(id);
        return R.ok().put("data", daibanchuyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DaibanchuyuanEntity daibanchuyuan = daibanchuyuanService.selectById(id);
        return R.ok().put("data", daibanchuyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DaibanchuyuanEntity daibanchuyuan, HttpServletRequest request){
    	daibanchuyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daibanchuyuan);

        daibanchuyuanService.insert(daibanchuyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DaibanchuyuanEntity daibanchuyuan, HttpServletRequest request){
    	daibanchuyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daibanchuyuan);

        daibanchuyuanService.insert(daibanchuyuan);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DaibanchuyuanEntity daibanchuyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(daibanchuyuan);
        daibanchuyuanService.updateById(daibanchuyuan);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        daibanchuyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
