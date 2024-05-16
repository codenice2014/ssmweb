package com.entity.model;

import com.entity.YishengzhenzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 医生诊治
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-06-25 15:38:20
 */
public class YishengzhenzhiModel  implements Serializable {
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
	 * 就诊时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiuzhenshijian;
		
	/**
	 * 症状描述
	 */
	
	private String zhengzhuangmiaoshu;
		
	/**
	 * 诊断报告
	 */
	
	private String zhenduanbaogao;
		
	/**
	 * 输液药物
	 */
	
	private String shuyeyaowu;
		
	/**
	 * 住院病房
	 */
	
	private String zhuyuanbingfang;
		
	/**
	 * 住院床号
	 */
	
	private String zhuyuanchuanghao;
		
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
	 * 设置：就诊时间
	 */
	 
	public void setJiuzhenshijian(Date jiuzhenshijian) {
		this.jiuzhenshijian = jiuzhenshijian;
	}
	
	/**
	 * 获取：就诊时间
	 */
	public Date getJiuzhenshijian() {
		return jiuzhenshijian;
	}
				
	
	/**
	 * 设置：症状描述
	 */
	 
	public void setZhengzhuangmiaoshu(String zhengzhuangmiaoshu) {
		this.zhengzhuangmiaoshu = zhengzhuangmiaoshu;
	}
	
	/**
	 * 获取：症状描述
	 */
	public String getZhengzhuangmiaoshu() {
		return zhengzhuangmiaoshu;
	}
				
	
	/**
	 * 设置：诊断报告
	 */
	 
	public void setZhenduanbaogao(String zhenduanbaogao) {
		this.zhenduanbaogao = zhenduanbaogao;
	}
	
	/**
	 * 获取：诊断报告
	 */
	public String getZhenduanbaogao() {
		return zhenduanbaogao;
	}
				
	
	/**
	 * 设置：输液药物
	 */
	 
	public void setShuyeyaowu(String shuyeyaowu) {
		this.shuyeyaowu = shuyeyaowu;
	}
	
	/**
	 * 获取：输液药物
	 */
	public String getShuyeyaowu() {
		return shuyeyaowu;
	}
				
	
	/**
	 * 设置：住院病房
	 */
	 
	public void setZhuyuanbingfang(String zhuyuanbingfang) {
		this.zhuyuanbingfang = zhuyuanbingfang;
	}
	
	/**
	 * 获取：住院病房
	 */
	public String getZhuyuanbingfang() {
		return zhuyuanbingfang;
	}
				
	
	/**
	 * 设置：住院床号
	 */
	 
	public void setZhuyuanchuanghao(String zhuyuanchuanghao) {
		this.zhuyuanchuanghao = zhuyuanchuanghao;
	}
	
	/**
	 * 获取：住院床号
	 */
	public String getZhuyuanchuanghao() {
		return zhuyuanchuanghao;
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
