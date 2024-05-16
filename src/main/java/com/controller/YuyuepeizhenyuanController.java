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

import com.entity.YuyuepeizhenyuanEntity;
import com.entity.view.YuyuepeizhenyuanView;

import com.service.YuyuepeizhenyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 预约陪诊员
 * 后端接口
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@RestController
@RequestMapping("/yuyuepeizhenyuan")
public class YuyuepeizhenyuanController {
    @Autowired
    private YuyuepeizhenyuanService yuyuepeizhenyuanService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuyuepeizhenyuanEntity yuyuepeizhenyuan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("peizhenyuan")) {
			yuyuepeizhenyuan.setPeizhenzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			yuyuepeizhenyuan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuyuepeizhenyuanEntity> ew = new EntityWrapper<YuyuepeizhenyuanEntity>();


		PageUtils page = yuyuepeizhenyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyuepeizhenyuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuyuepeizhenyuanEntity yuyuepeizhenyuan, 
		HttpServletRequest request){
        EntityWrapper<YuyuepeizhenyuanEntity> ew = new EntityWrapper<YuyuepeizhenyuanEntity>();

		PageUtils page = yuyuepeizhenyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyuepeizhenyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuyuepeizhenyuanEntity yuyuepeizhenyuan){
       	EntityWrapper<YuyuepeizhenyuanEntity> ew = new EntityWrapper<YuyuepeizhenyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuyuepeizhenyuan, "yuyuepeizhenyuan")); 
        return R.ok().put("data", yuyuepeizhenyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuyuepeizhenyuanEntity yuyuepeizhenyuan){
        EntityWrapper< YuyuepeizhenyuanEntity> ew = new EntityWrapper< YuyuepeizhenyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuyuepeizhenyuan, "yuyuepeizhenyuan")); 
		YuyuepeizhenyuanView yuyuepeizhenyuanView =  yuyuepeizhenyuanService.selectView(ew);
		return R.ok("查询预约陪诊员成功").put("data", yuyuepeizhenyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuyuepeizhenyuanEntity yuyuepeizhenyuan = yuyuepeizhenyuanService.selectById(id);
        return R.ok().put("data", yuyuepeizhenyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuyuepeizhenyuanEntity yuyuepeizhenyuan = yuyuepeizhenyuanService.selectById(id);
        return R.ok().put("data", yuyuepeizhenyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuyuepeizhenyuanEntity yuyuepeizhenyuan, HttpServletRequest request){
    	yuyuepeizhenyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyuepeizhenyuan);

        yuyuepeizhenyuanService.insert(yuyuepeizhenyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuyuepeizhenyuanEntity yuyuepeizhenyuan, HttpServletRequest request){
    	yuyuepeizhenyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyuepeizhenyuan);

        yuyuepeizhenyuanService.insert(yuyuepeizhenyuan);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuyuepeizhenyuanEntity yuyuepeizhenyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuyuepeizhenyuan);
        yuyuepeizhenyuanService.updateById(yuyuepeizhenyuan);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<YuyuepeizhenyuanEntity> list = new ArrayList<YuyuepeizhenyuanEntity>();
        for(Long id : ids) {
            YuyuepeizhenyuanEntity yuyuepeizhenyuan = yuyuepeizhenyuanService.selectById(id);
            yuyuepeizhenyuan.setSfsh(sfsh);
            yuyuepeizhenyuan.setShhf(shhf);
            list.add(yuyuepeizhenyuan);
        }
        yuyuepeizhenyuanService.updateBatchById(list);
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuyuepeizhenyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
