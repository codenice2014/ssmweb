package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaibanchuyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaibanchuyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaibanchuyuanView;


/**
 * 代办出院
 *
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface DaibanchuyuanService extends IService<DaibanchuyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaibanchuyuanVO> selectListVO(Wrapper<DaibanchuyuanEntity> wrapper);
   	
   	DaibanchuyuanVO selectVO(@Param("ew") Wrapper<DaibanchuyuanEntity> wrapper);
   	
   	List<DaibanchuyuanView> selectListView(Wrapper<DaibanchuyuanEntity> wrapper);
   	
   	DaibanchuyuanView selectView(@Param("ew") Wrapper<DaibanchuyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaibanchuyuanEntity> wrapper);
   	

}

