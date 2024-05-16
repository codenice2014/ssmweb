package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuyuepeizhenyuanDao;
import com.entity.YuyuepeizhenyuanEntity;
import com.service.YuyuepeizhenyuanService;
import com.entity.vo.YuyuepeizhenyuanVO;
import com.entity.view.YuyuepeizhenyuanView;

@Service("yuyuepeizhenyuanService")
public class YuyuepeizhenyuanServiceImpl extends ServiceImpl<YuyuepeizhenyuanDao, YuyuepeizhenyuanEntity> implements YuyuepeizhenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuepeizhenyuanEntity> page = this.selectPage(
                new Query<YuyuepeizhenyuanEntity>(params).getPage(),
                new EntityWrapper<YuyuepeizhenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuepeizhenyuanEntity> wrapper) {
		  Page<YuyuepeizhenyuanView> page =new Query<YuyuepeizhenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuepeizhenyuanVO> selectListVO(Wrapper<YuyuepeizhenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuepeizhenyuanVO selectVO(Wrapper<YuyuepeizhenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuepeizhenyuanView> selectListView(Wrapper<YuyuepeizhenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuepeizhenyuanView selectView(Wrapper<YuyuepeizhenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
