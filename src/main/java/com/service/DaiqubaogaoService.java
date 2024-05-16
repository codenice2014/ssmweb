package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaiqubaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaiqubaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaiqubaogaoView;


/**
 * 代取报告
 *
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface DaiqubaogaoService extends IService<DaiqubaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaiqubaogaoVO> selectListVO(Wrapper<DaiqubaogaoEntity> wrapper);
   	
   	DaiqubaogaoVO selectVO(@Param("ew") Wrapper<DaiqubaogaoEntity> wrapper);
   	
   	List<DaiqubaogaoView> selectListView(Wrapper<DaiqubaogaoEntity> wrapper);
   	
   	DaiqubaogaoView selectView(@Param("ew") Wrapper<DaiqubaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaiqubaogaoEntity> wrapper);
   	

}

