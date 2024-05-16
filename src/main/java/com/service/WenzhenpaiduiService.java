package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhenpaiduiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhenpaiduiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhenpaiduiView;


/**
 * 问诊排队
 *
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface WenzhenpaiduiService extends IService<WenzhenpaiduiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhenpaiduiVO> selectListVO(Wrapper<WenzhenpaiduiEntity> wrapper);
   	
   	WenzhenpaiduiVO selectVO(@Param("ew") Wrapper<WenzhenpaiduiEntity> wrapper);
   	
   	List<WenzhenpaiduiView> selectListView(Wrapper<WenzhenpaiduiEntity> wrapper);
   	
   	WenzhenpaiduiView selectView(@Param("ew") Wrapper<WenzhenpaiduiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhenpaiduiEntity> wrapper);
   	

}

