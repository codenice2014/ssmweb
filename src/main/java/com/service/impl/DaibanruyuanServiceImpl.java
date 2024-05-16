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


import com.dao.DaibanruyuanDao;
import com.entity.DaibanruyuanEntity;
import com.service.DaibanruyuanService;
import com.entity.vo.DaibanruyuanVO;
import com.entity.view.DaibanruyuanView;

@Service("daibanruyuanService")
public class DaibanruyuanServiceImpl extends ServiceImpl<DaibanruyuanDao, DaibanruyuanEntity> implements DaibanruyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaibanruyuanEntity> page = this.selectPage(
                new Query<DaibanruyuanEntity>(params).getPage(),
                new EntityWrapper<DaibanruyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaibanruyuanEntity> wrapper) {
		  Page<DaibanruyuanView> page =new Query<DaibanruyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaibanruyuanVO> selectListVO(Wrapper<DaibanruyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaibanruyuanVO selectVO(Wrapper<DaibanruyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaibanruyuanView> selectListView(Wrapper<DaibanruyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaibanruyuanView selectView(Wrapper<DaibanruyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
