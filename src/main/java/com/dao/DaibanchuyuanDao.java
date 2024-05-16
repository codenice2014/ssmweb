package com.dao;

import com.entity.DaibanchuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaibanchuyuanVO;
import com.entity.view.DaibanchuyuanView;


/**
 * 代办出院
 * 
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface DaibanchuyuanDao extends BaseMapper<DaibanchuyuanEntity> {
	
	List<DaibanchuyuanVO> selectListVO(@Param("ew") Wrapper<DaibanchuyuanEntity> wrapper);
	
	DaibanchuyuanVO selectVO(@Param("ew") Wrapper<DaibanchuyuanEntity> wrapper);
	
	List<DaibanchuyuanView> selectListView(@Param("ew") Wrapper<DaibanchuyuanEntity> wrapper);

	List<DaibanchuyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DaibanchuyuanEntity> wrapper);
	
	DaibanchuyuanView selectView(@Param("ew") Wrapper<DaibanchuyuanEntity> wrapper);
	

}
