package com.dao;

import com.entity.DaibanruyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaibanruyuanVO;
import com.entity.view.DaibanruyuanView;


/**
 * 代办入院
 * 
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface DaibanruyuanDao extends BaseMapper<DaibanruyuanEntity> {
	
	List<DaibanruyuanVO> selectListVO(@Param("ew") Wrapper<DaibanruyuanEntity> wrapper);
	
	DaibanruyuanVO selectVO(@Param("ew") Wrapper<DaibanruyuanEntity> wrapper);
	
	List<DaibanruyuanView> selectListView(@Param("ew") Wrapper<DaibanruyuanEntity> wrapper);

	List<DaibanruyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DaibanruyuanEntity> wrapper);
	
	DaibanruyuanView selectView(@Param("ew") Wrapper<DaibanruyuanEntity> wrapper);
	

}
