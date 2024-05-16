package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhenquyaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhenquyaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhenquyaoView;


/**
 * 问诊取药
 *
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface WenzhenquyaoService extends IService<WenzhenquyaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhenquyaoVO> selectListVO(Wrapper<WenzhenquyaoEntity> wrapper);
   	
   	WenzhenquyaoVO selectVO(@Param("ew") Wrapper<WenzhenquyaoEntity> wrapper);
   	
   	List<WenzhenquyaoView> selectListView(Wrapper<WenzhenquyaoEntity> wrapper);
   	
   	WenzhenquyaoView selectView(@Param("ew") Wrapper<WenzhenquyaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhenquyaoEntity> wrapper);
   	

}

