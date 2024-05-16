package com.entity.view;

import com.entity.PeizhenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 陪诊员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@TableName("peizhenyuan")
public class PeizhenyuanView  extends PeizhenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeizhenyuanView(){
	}
 
 	public PeizhenyuanView(PeizhenyuanEntity peizhenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, peizhenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
