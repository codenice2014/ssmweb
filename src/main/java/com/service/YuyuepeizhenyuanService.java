package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuepeizhenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuepeizhenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuepeizhenyuanView;


/**
 * 预约陪诊员
 *
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface YuyuepeizhenyuanService extends IService<YuyuepeizhenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuepeizhenyuanVO> selectListVO(Wrapper<YuyuepeizhenyuanEntity> wrapper);
   	
   	YuyuepeizhenyuanVO selectVO(@Param("ew") Wrapper<YuyuepeizhenyuanEntity> wrapper);
   	
   	List<YuyuepeizhenyuanView> selectListView(Wrapper<YuyuepeizhenyuanEntity> wrapper);
   	
   	YuyuepeizhenyuanView selectView(@Param("ew") Wrapper<YuyuepeizhenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuepeizhenyuanEntity> wrapper);
   	

}

