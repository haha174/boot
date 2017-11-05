/**
 * 
 */ 
package com.wen.boot.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年4月5日 下午10:37:55 
* 类说明 
*/
/**
 * @author haha
 *
 */

public class User {
	private int id;
	private String name;
	private int age;
	@JSONField(format="yyyy-mm-dd HH:mm")
	private Date createTime;
	private String remakes;
	
	/** serialize  是否需要序列化
	 * @return the remakes
	 */
	@JSONField(serialize=false)
	public String getRemakes() {
		return remakes;
	}
	
	public void setRemakes(String remakes) {
		this.remakes = remakes;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
 