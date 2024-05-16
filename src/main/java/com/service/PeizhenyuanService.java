package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeizhenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeizhenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeizhenyuanView;


/**
 * 陪诊员
 *
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface PeizhenyuanService extends IService<PeizhenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeizhenyuanVO> selectListVO(Wrapper<PeizhenyuanEntity> wrapper);
   	
   	PeizhenyuanVO selectVO(@Param("ew") Wrapper<PeizhenyuanEntity> wrapper);
   	
   	List<PeizhenyuanView> selectListView(Wrapper<PeizhenyuanEntity> wrapper);
   	
   	PeizhenyuanView selectView(@Param("ew") Wrapper<PeizhenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeizhenyuanEntity> wrapper);
   	

}

