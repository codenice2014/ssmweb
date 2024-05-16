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


import com.dao.DaiqubaogaoDao;
import com.entity.DaiqubaogaoEntity;
import com.service.DaiqubaogaoService;
import com.entity.vo.DaiqubaogaoVO;
import com.entity.view.DaiqubaogaoView;

@Service("daiqubaogaoService")
public class DaiqubaogaoServiceImpl extends ServiceImpl<DaiqubaogaoDao, DaiqubaogaoEntity> implements DaiqubaogaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaiqubaogaoEntity> page = this.selectPage(
                new Query<DaiqubaogaoEntity>(params).getPage(),
                new EntityWrapper<DaiqubaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaiqubaogaoEntity> wrapper) {
		  Page<DaiqubaogaoView> page =new Query<DaiqubaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaiqubaogaoVO> selectListVO(Wrapper<DaiqubaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaiqubaogaoVO selectVO(Wrapper<DaiqubaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaiqubaogaoView> selectListView(Wrapper<DaiqubaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaiqubaogaoView selectView(Wrapper<DaiqubaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
