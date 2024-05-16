package com.dao;

import com.entity.WenzhenpaiduiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhenpaiduiVO;
import com.entity.view.WenzhenpaiduiView;


/**
 * 问诊排队
 * 
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface WenzhenpaiduiDao extends BaseMapper<WenzhenpaiduiEntity> {
	
	List<WenzhenpaiduiVO> selectListVO(@Param("ew") Wrapper<WenzhenpaiduiEntity> wrapper);
	
	WenzhenpaiduiVO selectVO(@Param("ew") Wrapper<WenzhenpaiduiEntity> wrapper);
	
	List<WenzhenpaiduiView> selectListView(@Param("ew") Wrapper<WenzhenpaiduiEntity> wrapper);

	List<WenzhenpaiduiView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhenpaiduiEntity> wrapper);
	
	WenzhenpaiduiView selectView(@Param("ew") Wrapper<WenzhenpaiduiEntity> wrapper);
	

}
