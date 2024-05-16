package com.dao;

import com.entity.YuyuepeizhenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuepeizhenyuanVO;
import com.entity.view.YuyuepeizhenyuanView;


/**
 * 预约陪诊员
 * 
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface YuyuepeizhenyuanDao extends BaseMapper<YuyuepeizhenyuanEntity> {
	
	List<YuyuepeizhenyuanVO> selectListVO(@Param("ew") Wrapper<YuyuepeizhenyuanEntity> wrapper);
	
	YuyuepeizhenyuanVO selectVO(@Param("ew") Wrapper<YuyuepeizhenyuanEntity> wrapper);
	
	List<YuyuepeizhenyuanView> selectListView(@Param("ew") Wrapper<YuyuepeizhenyuanEntity> wrapper);

	List<YuyuepeizhenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuepeizhenyuanEntity> wrapper);
	
	YuyuepeizhenyuanView selectView(@Param("ew") Wrapper<YuyuepeizhenyuanEntity> wrapper);
	

}
