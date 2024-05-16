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

import com.entity.WenzhenpaiduiEntity;
import com.entity.view.WenzhenpaiduiView;

import com.service.WenzhenpaiduiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 问诊排队
 * 后端接口
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@RestController
@RequestMapping("/wenzhenpaidui")
public class WenzhenpaiduiController {
    @Autowired
    private WenzhenpaiduiService wenzhenpaiduiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenzhenpaiduiEntity wenzhenpaidui, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wenzhenpaidui.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wenzhenpaidui.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peizhenyuan")) {
			wenzhenpaidui.setPeizhenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WenzhenpaiduiEntity> ew = new EntityWrapper<WenzhenpaiduiEntity>();


		PageUtils page = wenzhenpaiduiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhenpaidui), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenzhenpaiduiEntity wenzhenpaidui, 
		HttpServletRequest request){
        EntityWrapper<WenzhenpaiduiEntity> ew = new EntityWrapper<WenzhenpaiduiEntity>();

		PageUtils page = wenzhenpaiduiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhenpaidui), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenzhenpaiduiEntity wenzhenpaidui){
       	EntityWrapper<WenzhenpaiduiEntity> ew = new EntityWrapper<WenzhenpaiduiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenzhenpaidui, "wenzhenpaidui")); 
        return R.ok().put("data", wenzhenpaiduiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenzhenpaiduiEntity wenzhenpaidui){
        EntityWrapper< WenzhenpaiduiEntity> ew = new EntityWrapper< WenzhenpaiduiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenzhenpaidui, "wenzhenpaidui")); 
		WenzhenpaiduiView wenzhenpaiduiView =  wenzhenpaiduiService.selectView(ew);
		return R.ok("查询问诊排队成功").put("data", wenzhenpaiduiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenzhenpaiduiEntity wenzhenpaidui = wenzhenpaiduiService.selectById(id);
        return R.ok().put("data", wenzhenpaidui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenzhenpaiduiEntity wenzhenpaidui = wenzhenpaiduiService.selectById(id);
        return R.ok().put("data", wenzhenpaidui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenzhenpaiduiEntity wenzhenpaidui, HttpServletRequest request){
    	wenzhenpaidui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenzhenpaidui);

        wenzhenpaiduiService.insert(wenzhenpaidui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody WenzhenpaiduiEntity wenzhenpaidui, HttpServletRequest request){
    	wenzhenpaidui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenzhenpaidui);

        wenzhenpaiduiService.insert(wenzhenpaidui);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WenzhenpaiduiEntity wenzhenpaidui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenzhenpaidui);
        wenzhenpaiduiService.updateById(wenzhenpaidui);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenzhenpaiduiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
