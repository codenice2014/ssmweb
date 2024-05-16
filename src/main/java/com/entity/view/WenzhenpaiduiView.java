package com.entity.view;

import com.entity.WenzhenpaiduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问诊排队
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@TableName("wenzhenpaidui")
public class WenzhenpaiduiView  extends WenzhenpaiduiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhenpaiduiView(){
	}
 
 	public WenzhenpaiduiView(WenzhenpaiduiEntity wenzhenpaiduiEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhenpaiduiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
