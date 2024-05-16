package com.dao;

import com.entity.WenzhenquyaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhenquyaoVO;
import com.entity.view.WenzhenquyaoView;


/**
 * 问诊取药
 * 
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface WenzhenquyaoDao extends BaseMapper<WenzhenquyaoEntity> {
	
	List<WenzhenquyaoVO> selectListVO(@Param("ew") Wrapper<WenzhenquyaoEntity> wrapper);
	
	WenzhenquyaoVO selectVO(@Param("ew") Wrapper<WenzhenquyaoEntity> wrapper);
	
	List<WenzhenquyaoView> selectListView(@Param("ew") Wrapper<WenzhenquyaoEntity> wrapper);

	List<WenzhenquyaoView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhenquyaoEntity> wrapper);
	
	WenzhenquyaoView selectView(@Param("ew") Wrapper<WenzhenquyaoEntity> wrapper);
	

}
