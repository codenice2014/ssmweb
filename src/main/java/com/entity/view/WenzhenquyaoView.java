package com.entity.view;

import com.entity.WenzhenquyaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问诊取药
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@TableName("wenzhenquyao")
public class WenzhenquyaoView  extends WenzhenquyaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhenquyaoView(){
	}
 
 	public WenzhenquyaoView(WenzhenquyaoEntity wenzhenquyaoEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhenquyaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
