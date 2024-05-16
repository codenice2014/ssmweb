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

import com.entity.DaibanruyuanEntity;
import com.entity.view.DaibanruyuanView;

import com.service.DaibanruyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 代办入院
 * 后端接口
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@RestController
@RequestMapping("/daibanruyuan")
public class DaibanruyuanController {
    @Autowired
    private DaibanruyuanService daibanruyuanService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DaibanruyuanEntity daibanruyuan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			daibanruyuan.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			daibanruyuan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peizhenyuan")) {
			daibanruyuan.setPeizhenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DaibanruyuanEntity> ew = new EntityWrapper<DaibanruyuanEntity>();


		PageUtils page = daibanruyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daibanruyuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DaibanruyuanEntity daibanruyuan, 
		HttpServletRequest request){
        EntityWrapper<DaibanruyuanEntity> ew = new EntityWrapper<DaibanruyuanEntity>();

		PageUtils page = daibanruyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daibanruyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DaibanruyuanEntity daibanruyuan){
       	EntityWrapper<DaibanruyuanEntity> ew = new EntityWrapper<DaibanruyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( daibanruyuan, "daibanruyuan")); 
        return R.ok().put("data", daibanruyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DaibanruyuanEntity daibanruyuan){
        EntityWrapper< DaibanruyuanEntity> ew = new EntityWrapper< DaibanruyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( daibanruyuan, "daibanruyuan")); 
		DaibanruyuanView daibanruyuanView =  daibanruyuanService.selectView(ew);
		return R.ok("查询代办入院成功").put("data", daibanruyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DaibanruyuanEntity daibanruyuan = daibanruyuanService.selectById(id);
        return R.ok().put("data", daibanruyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DaibanruyuanEntity daibanruyuan = daibanruyuanService.selectById(id);
        return R.ok().put("data", daibanruyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DaibanruyuanEntity daibanruyuan, HttpServletRequest request){
    	daibanruyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daibanruyuan);

        daibanruyuanService.insert(daibanruyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DaibanruyuanEntity daibanruyuan, HttpServletRequest request){
    	daibanruyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daibanruyuan);

        daibanruyuanService.insert(daibanruyuan);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DaibanruyuanEntity daibanruyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(daibanruyuan);
        daibanruyuanService.updateById(daibanruyuan);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        daibanruyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
