package com.dao;

import com.entity.YishengzhenzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishengzhenzhiVO;
import com.entity.view.YishengzhenzhiView;


/**
 * 医生诊治
 * 
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface YishengzhenzhiDao extends BaseMapper<YishengzhenzhiEntity> {
	
	List<YishengzhenzhiVO> selectListVO(@Param("ew") Wrapper<YishengzhenzhiEntity> wrapper);
	
	YishengzhenzhiVO selectVO(@Param("ew") Wrapper<YishengzhenzhiEntity> wrapper);
	
	List<YishengzhenzhiView> selectListView(@Param("ew") Wrapper<YishengzhenzhiEntity> wrapper);

	List<YishengzhenzhiView> selectListView(Pagination page,@Param("ew") Wrapper<YishengzhenzhiEntity> wrapper);
	
	YishengzhenzhiView selectView(@Param("ew") Wrapper<YishengzhenzhiEntity> wrapper);
	

}
