package com.wen.boot.dto;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class User{
    private int id;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;//创建时间
    @JSONField(serialize = false)  
    private String name;
    @JSONField(deserialize = false)  
    private int age;
    @JSONField(name = "list")
    private List<Address> addrList;

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
    public List<Address> getAddrList() {
        return addrList;
    }
    public void setAddrList(List<Address> addrList) {
        this.addrList = addrList;
    }
    
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}