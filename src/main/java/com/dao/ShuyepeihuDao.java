package com.dao;

import com.entity.ShuyepeihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuyepeihuVO;
import com.entity.view.ShuyepeihuView;


/**
 * 输液陪护
 * 
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface ShuyepeihuDao extends BaseMapper<ShuyepeihuEntity> {
	
	List<ShuyepeihuVO> selectListVO(@Param("ew") Wrapper<ShuyepeihuEntity> wrapper);
	
	ShuyepeihuVO selectVO(@Param("ew") Wrapper<ShuyepeihuEntity> wrapper);
	
	List<ShuyepeihuView> selectListView(@Param("ew") Wrapper<ShuyepeihuEntity> wrapper);

	List<ShuyepeihuView> selectListView(Pagination page,@Param("ew") Wrapper<ShuyepeihuEntity> wrapper);
	
	ShuyepeihuView selectView(@Param("ew") Wrapper<ShuyepeihuEntity> wrapper);
	

}
