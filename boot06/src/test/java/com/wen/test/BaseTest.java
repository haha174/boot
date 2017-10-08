package com.wen.test;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wen.boot.App;


/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
@WebAppConfiguration
public class BaseTest {

}
