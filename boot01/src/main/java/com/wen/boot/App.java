package com.wen.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import com.wen.boot.config.ConfigString;

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

    }
}
