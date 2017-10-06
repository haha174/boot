package com.wen.boot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.fastjson.JSON;
import com.wen.boot.dto.Address;
import com.wen.boot.dto.User;

/**
 * 
 * Hello world!
 *
 */
@SpringBootApplication//标注这个是一个springboot  的引用程序
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class,args);
        System.out.println( "Hello World" );
        User user=new User();
        user.setName("cxhc");
        user.setCreateTime(new Date());
        user.setAge(11);
        user.setId(1);
        List <Address> list=new ArrayList<Address>();
        Address address=new Address();
        address.setaArea("某区");
        address.setCity("某市");
        address.setDetail("某大学");
        address.setProvince("某省");
        list.add(address);
        address.setaArea("某某区");
        address.setCity("某某市");
        address.setDetail("某某大学");
        address.setProvince("某某省");
        list.add(address);
        user.setAddrList(list);
        System.out.println(JSON.toJSONString(user));
    }
}
