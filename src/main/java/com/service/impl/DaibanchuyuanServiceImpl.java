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


import com.dao.DaibanchuyuanDao;
import com.entity.DaibanchuyuanEntity;
import com.service.DaibanchuyuanService;
import com.entity.vo.DaibanchuyuanVO;
import com.entity.view.DaibanchuyuanView;

@Service("daibanchuyuanService")
public class DaibanchuyuanServiceImpl extends ServiceImpl<DaibanchuyuanDao, DaibanchuyuanEntity> implements DaibanchuyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaibanchuyuanEntity> page = this.selectPage(
                new Query<DaibanchuyuanEntity>(params).getPage(),
                new EntityWrapper<DaibanchuyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaibanchuyuanEntity> wrapper) {
		  Page<DaibanchuyuanView> page =new Query<DaibanchuyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaibanchuyuanVO> selectListVO(Wrapper<DaibanchuyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaibanchuyuanVO selectVO(Wrapper<DaibanchuyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaibanchuyuanView> selectListView(Wrapper<DaibanchuyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaibanchuyuanView selectView(Wrapper<DaibanchuyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
