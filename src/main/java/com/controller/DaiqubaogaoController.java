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

import com.entity.DaiqubaogaoEntity;
import com.entity.view.DaiqubaogaoView;

import com.service.DaiqubaogaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 代取报告
 * 后端接口
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@RestController
@RequestMapping("/daiqubaogao")
public class DaiqubaogaoController {
    @Autowired
    private DaiqubaogaoService daiqubaogaoService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DaiqubaogaoEntity daiqubaogao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			daiqubaogao.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			daiqubaogao.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peizhenyuan")) {
			daiqubaogao.setPeizhenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DaiqubaogaoEntity> ew = new EntityWrapper<DaiqubaogaoEntity>();


		PageUtils page = daiqubaogaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daiqubaogao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DaiqubaogaoEntity daiqubaogao, 
		HttpServletRequest request){
        EntityWrapper<DaiqubaogaoEntity> ew = new EntityWrapper<DaiqubaogaoEntity>();

		PageUtils page = daiqubaogaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daiqubaogao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DaiqubaogaoEntity daiqubaogao){
       	EntityWrapper<DaiqubaogaoEntity> ew = new EntityWrapper<DaiqubaogaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( daiqubaogao, "daiqubaogao")); 
        return R.ok().put("data", daiqubaogaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DaiqubaogaoEntity daiqubaogao){
        EntityWrapper< DaiqubaogaoEntity> ew = new EntityWrapper< DaiqubaogaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( daiqubaogao, "daiqubaogao")); 
		DaiqubaogaoView daiqubaogaoView =  daiqubaogaoService.selectView(ew);
		return R.ok("查询代取报告成功").put("data", daiqubaogaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DaiqubaogaoEntity daiqubaogao = daiqubaogaoService.selectById(id);
        return R.ok().put("data", daiqubaogao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DaiqubaogaoEntity daiqubaogao = daiqubaogaoService.selectById(id);
        return R.ok().put("data", daiqubaogao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DaiqubaogaoEntity daiqubaogao, HttpServletRequest request){
    	daiqubaogao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daiqubaogao);

        daiqubaogaoService.insert(daiqubaogao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DaiqubaogaoEntity daiqubaogao, HttpServletRequest request){
    	daiqubaogao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daiqubaogao);

        daiqubaogaoService.insert(daiqubaogao);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DaiqubaogaoEntity daiqubaogao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(daiqubaogao);
        daiqubaogaoService.updateById(daiqubaogao);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        daiqubaogaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
