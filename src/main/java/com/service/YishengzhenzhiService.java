package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishengzhenzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishengzhenzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishengzhenzhiView;


/**
 * 医生诊治
 *
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public interface YishengzhenzhiService extends IService<YishengzhenzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishengzhenzhiVO> selectListVO(Wrapper<YishengzhenzhiEntity> wrapper);
   	
   	YishengzhenzhiVO selectVO(@Param("ew") Wrapper<YishengzhenzhiEntity> wrapper);
   	
   	List<YishengzhenzhiView> selectListView(Wrapper<YishengzhenzhiEntity> wrapper);
   	
   	YishengzhenzhiView selectView(@Param("ew") Wrapper<YishengzhenzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishengzhenzhiEntity> wrapper);
   	

}

