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


import com.dao.YishengzhenzhiDao;
import com.entity.YishengzhenzhiEntity;
import com.service.YishengzhenzhiService;
import com.entity.vo.YishengzhenzhiVO;
import com.entity.view.YishengzhenzhiView;

@Service("yishengzhenzhiService")
public class YishengzhenzhiServiceImpl extends ServiceImpl<YishengzhenzhiDao, YishengzhenzhiEntity> implements YishengzhenzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishengzhenzhiEntity> page = this.selectPage(
                new Query<YishengzhenzhiEntity>(params).getPage(),
                new EntityWrapper<YishengzhenzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishengzhenzhiEntity> wrapper) {
		  Page<YishengzhenzhiView> page =new Query<YishengzhenzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishengzhenzhiVO> selectListVO(Wrapper<YishengzhenzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishengzhenzhiVO selectVO(Wrapper<YishengzhenzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishengzhenzhiView> selectListView(Wrapper<YishengzhenzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishengzhenzhiView selectView(Wrapper<YishengzhenzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
