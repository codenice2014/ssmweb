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

import com.entity.ShuyepeihuEntity;
import com.entity.view.ShuyepeihuView;

import com.service.ShuyepeihuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 输液陪护
 * 后端接口
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@RestController
@RequestMapping("/shuyepeihu")
public class ShuyepeihuController {
    @Autowired
    private ShuyepeihuService shuyepeihuService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShuyepeihuEntity shuyepeihu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			shuyepeihu.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			shuyepeihu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peizhenyuan")) {
			shuyepeihu.setPeizhenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShuyepeihuEntity> ew = new EntityWrapper<ShuyepeihuEntity>();


		PageUtils page = shuyepeihuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuyepeihu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShuyepeihuEntity shuyepeihu, 
		HttpServletRequest request){
        EntityWrapper<ShuyepeihuEntity> ew = new EntityWrapper<ShuyepeihuEntity>();

		PageUtils page = shuyepeihuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuyepeihu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShuyepeihuEntity shuyepeihu){
       	EntityWrapper<ShuyepeihuEntity> ew = new EntityWrapper<ShuyepeihuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shuyepeihu, "shuyepeihu")); 
        return R.ok().put("data", shuyepeihuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShuyepeihuEntity shuyepeihu){
        EntityWrapper< ShuyepeihuEntity> ew = new EntityWrapper< ShuyepeihuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shuyepeihu, "shuyepeihu")); 
		ShuyepeihuView shuyepeihuView =  shuyepeihuService.selectView(ew);
		return R.ok("查询输液陪护成功").put("data", shuyepeihuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShuyepeihuEntity shuyepeihu = shuyepeihuService.selectById(id);
        return R.ok().put("data", shuyepeihu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShuyepeihuEntity shuyepeihu = shuyepeihuService.selectById(id);
        return R.ok().put("data", shuyepeihu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShuyepeihuEntity shuyepeihu, HttpServletRequest request){
    	shuyepeihu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shuyepeihu);

        shuyepeihuService.insert(shuyepeihu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShuyepeihuEntity shuyepeihu, HttpServletRequest request){
    	shuyepeihu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shuyepeihu);

        shuyepeihuService.insert(shuyepeihu);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShuyepeihuEntity shuyepeihu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shuyepeihu);
        shuyepeihuService.updateById(shuyepeihu);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shuyepeihuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
