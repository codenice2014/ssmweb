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


import com.dao.WenzhenpaiduiDao;
import com.entity.WenzhenpaiduiEntity;
import com.service.WenzhenpaiduiService;
import com.entity.vo.WenzhenpaiduiVO;
import com.entity.view.WenzhenpaiduiView;

@Service("wenzhenpaiduiService")
public class WenzhenpaiduiServiceImpl extends ServiceImpl<WenzhenpaiduiDao, WenzhenpaiduiEntity> implements WenzhenpaiduiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhenpaiduiEntity> page = this.selectPage(
                new Query<WenzhenpaiduiEntity>(params).getPage(),
                new EntityWrapper<WenzhenpaiduiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhenpaiduiEntity> wrapper) {
		  Page<WenzhenpaiduiView> page =new Query<WenzhenpaiduiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenzhenpaiduiVO> selectListVO(Wrapper<WenzhenpaiduiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhenpaiduiVO selectVO(Wrapper<WenzhenpaiduiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhenpaiduiView> selectListView(Wrapper<WenzhenpaiduiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhenpaiduiView selectView(Wrapper<WenzhenpaiduiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
