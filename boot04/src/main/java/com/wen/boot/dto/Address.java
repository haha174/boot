package com.wen.boot.dto;

public class Address{
	/*
	 * 省份
	 */
    private String province;
	/*
	 * 城市
	 */
    private String city;
    /*
	 * 地区
	 */
    private String area;
    /*
	 * 具体详细地址
	 */
    private String detail;
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getArea() {
        return area;
    }
    @Override
	public String toString() {
		return "Address [province=" + province + ", city=" + city + ", area=" + area + ", detail=" + detail + "]";
	}
	public void setaArea(String area) {
        this.area = area;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

}