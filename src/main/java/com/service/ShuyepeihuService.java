package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuyepeihuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuyepeihuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuyepeihuView;


/**
 * 输液陪护
 *
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface ShuyepeihuService extends IService<ShuyepeihuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuyepeihuVO> selectListVO(Wrapper<ShuyepeihuEntity> wrapper);
   	
   	ShuyepeihuVO selectVO(@Param("ew") Wrapper<ShuyepeihuEntity> wrapper);
   	
   	List<ShuyepeihuView> selectListView(Wrapper<ShuyepeihuEntity> wrapper);
   	
   	ShuyepeihuView selectView(@Param("ew") Wrapper<ShuyepeihuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuyepeihuEntity> wrapper);
   	

}

