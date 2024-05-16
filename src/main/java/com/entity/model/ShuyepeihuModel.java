package com.entity.model;

import com.entity.ShuyepeihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 输液陪护
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public class ShuyepeihuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生账号
	 */
	
	private String yishengzhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 陪护时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date peihushijian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
	/**
	 * 输液
	 */
	
	private String shuye;
		
	/**
	 * 陪诊账号
	 */
	
	private String peizhenzhanghao;
		
	/**
	 * 陪诊姓名
	 */
	
	private String peizhenxingming;
				
	
	/**
	 * 设置：医生账号
	 */
	 
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：陪护时间
	 */
	 
	public void setPeihushijian(Date peihushijian) {
		this.peihushijian = peihushijian;
	}
	
	/**
	 * 获取：陪护时间
	 */
	public Date getPeihushijian() {
		return peihushijian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
				
	
	/**
	 * 设置：输液
	 */
	 
	public void setShuye(String shuye) {
		this.shuye = shuye;
	}
	
	/**
	 * 获取：输液
	 */
	public String getShuye() {
		return shuye;
	}
				
	
	/**
	 * 设置：陪诊账号
	 */
	 
	public void setPeizhenzhanghao(String peizhenzhanghao) {
		this.peizhenzhanghao = peizhenzhanghao;
	}
	
	/**
	 * 获取：陪诊账号
	 */
	public String getPeizhenzhanghao() {
		return peizhenzhanghao;
	}
				
	
	/**
	 * 设置：陪诊姓名
	 */
	 
	public void setPeizhenxingming(String peizhenxingming) {
		this.peizhenxingming = peizhenxingming;
	}
	
	/**
	 * 获取：陪诊姓名
	 */
	public String getPeizhenxingming() {
		return peizhenxingming;
	}
			
}
