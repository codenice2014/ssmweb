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


import com.dao.WenzhenquyaoDao;
import com.entity.WenzhenquyaoEntity;
import com.service.WenzhenquyaoService;
import com.entity.vo.WenzhenquyaoVO;
import com.entity.view.WenzhenquyaoView;

@Service("wenzhenquyaoService")
public class WenzhenquyaoServiceImpl extends ServiceImpl<WenzhenquyaoDao, WenzhenquyaoEntity> implements WenzhenquyaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhenquyaoEntity> page = this.selectPage(
                new Query<WenzhenquyaoEntity>(params).getPage(),
                new EntityWrapper<WenzhenquyaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhenquyaoEntity> wrapper) {
		  Page<WenzhenquyaoView> page =new Query<WenzhenquyaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenzhenquyaoVO> selectListVO(Wrapper<WenzhenquyaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhenquyaoVO selectVO(Wrapper<WenzhenquyaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhenquyaoView> selectListView(Wrapper<WenzhenquyaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhenquyaoView selectView(Wrapper<WenzhenquyaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
