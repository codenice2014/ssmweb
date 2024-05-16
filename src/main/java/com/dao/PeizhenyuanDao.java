package com.dao;

import com.entity.PeizhenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeizhenyuanVO;
import com.entity.view.PeizhenyuanView;


/**
 * 陪诊员
 * 
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface PeizhenyuanDao extends BaseMapper<PeizhenyuanEntity> {
	
	List<PeizhenyuanVO> selectListVO(@Param("ew") Wrapper<PeizhenyuanEntity> wrapper);
	
	PeizhenyuanVO selectVO(@Param("ew") Wrapper<PeizhenyuanEntity> wrapper);
	
	List<PeizhenyuanView> selectListView(@Param("ew") Wrapper<PeizhenyuanEntity> wrapper);

	List<PeizhenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<PeizhenyuanEntity> wrapper);
	
	PeizhenyuanView selectView(@Param("ew") Wrapper<PeizhenyuanEntity> wrapper);
	

}
