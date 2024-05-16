package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaibanruyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaibanruyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaibanruyuanView;


/**
 * 代办入院
 *
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface DaibanruyuanService extends IService<DaibanruyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaibanruyuanVO> selectListVO(Wrapper<DaibanruyuanEntity> wrapper);
   	
   	DaibanruyuanVO selectVO(@Param("ew") Wrapper<DaibanruyuanEntity> wrapper);
   	
   	List<DaibanruyuanView> selectListView(Wrapper<DaibanruyuanEntity> wrapper);
   	
   	DaibanruyuanView selectView(@Param("ew") Wrapper<DaibanruyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaibanruyuanEntity> wrapper);
   	

}

