package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 问诊取药
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
@TableName("wenzhenquyao")
public class WenzhenquyaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenzhenquyaoEntity() {
		
	}
	
	public WenzhenquyaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 诊疗编号
	 */
					
	private String zhenliaobianhao;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 医生账号
	 */
					
	private String yishengzhanghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 取药时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date quyaoshijian;
	
	/**
	 * 药方
	 */
					
	private String yaofang;
	
	/**
	 * 用法用量
	 */
					
	private String yongfayongliang;
	
	/**
	 * 陪诊账号
	 */
					
	private String peizhenzhanghao;
	
	/**
	 * 陪诊姓名
	 */
					
	private String peizhenxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：诊疗编号
	 */
	public void setZhenliaobianhao(String zhenliaobianhao) {
		this.zhenliaobianhao = zhenliaobianhao;
	}
	/**
	 * 获取：诊疗编号
	 */
	public String getZhenliaobianhao() {
		return zhenliaobianhao;
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
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：取药时间
	 */
	public void setQuyaoshijian(Date quyaoshijian) {
		this.quyaoshijian = quyaoshijian;
	}
	/**
	 * 获取：取药时间
	 */
	public Date getQuyaoshijian() {
		return quyaoshijian;
	}
	/**
	 * 设置：药方
	 */
	public void setYaofang(String yaofang) {
		this.yaofang = yaofang;
	}
	/**
	 * 获取：药方
	 */
	public String getYaofang() {
		return yaofang;
	}
	/**
	 * 设置：用法用量
	 */
	public void setYongfayongliang(String yongfayongliang) {
		this.yongfayongliang = yongfayongliang;
	}
	/**
	 * 获取：用法用量
	 */
	public String getYongfayongliang() {
		return yongfayongliang;
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
