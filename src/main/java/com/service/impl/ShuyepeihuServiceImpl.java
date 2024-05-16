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


import com.dao.ShuyepeihuDao;
import com.entity.ShuyepeihuEntity;
import com.service.ShuyepeihuService;
import com.entity.vo.ShuyepeihuVO;
import com.entity.view.ShuyepeihuView;

@Service("shuyepeihuService")
public class ShuyepeihuServiceImpl extends ServiceImpl<ShuyepeihuDao, ShuyepeihuEntity> implements ShuyepeihuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuyepeihuEntity> page = this.selectPage(
                new Query<ShuyepeihuEntity>(params).getPage(),
                new EntityWrapper<ShuyepeihuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuyepeihuEntity> wrapper) {
		  Page<ShuyepeihuView> page =new Query<ShuyepeihuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuyepeihuVO> selectListVO(Wrapper<ShuyepeihuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuyepeihuVO selectVO(Wrapper<ShuyepeihuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuyepeihuView> selectListView(Wrapper<ShuyepeihuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuyepeihuView selectView(Wrapper<ShuyepeihuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
