package com.dao;

import com.entity.DaiqubaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaiqubaogaoVO;
import com.entity.view.DaiqubaogaoView;


/**
 * 代取报告
 * 
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface DaiqubaogaoDao extends BaseMapper<DaiqubaogaoEntity> {
	
	List<DaiqubaogaoVO> selectListVO(@Param("ew") Wrapper<DaiqubaogaoEntity> wrapper);
	
	DaiqubaogaoVO selectVO(@Param("ew") Wrapper<DaiqubaogaoEntity> wrapper);
	
	List<DaiqubaogaoView> selectListView(@Param("ew") Wrapper<DaiqubaogaoEntity> wrapper);

	List<DaiqubaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<DaiqubaogaoEntity> wrapper);
	
	DaiqubaogaoView selectView(@Param("ew") Wrapper<DaiqubaogaoEntity> wrapper);
	

}
