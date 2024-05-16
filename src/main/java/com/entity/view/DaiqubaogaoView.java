package com.entity.view;

import com.entity.DaiqubaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 代取报告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@TableName("daiqubaogao")
public class DaiqubaogaoView  extends DaiqubaogaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaiqubaogaoView(){
	}
 
 	public DaiqubaogaoView(DaiqubaogaoEntity daiqubaogaoEntity){
 	try {
			BeanUtils.copyProperties(this, daiqubaogaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
