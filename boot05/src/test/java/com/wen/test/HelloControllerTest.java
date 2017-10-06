package com.wen.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.wen.boot.App;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
@WebAppConfiguration
public class HelloControllerTest {
    private static final Logger logger = LoggerFactory.getLogger(HelloControllerTest.class);
    private RestTemplate template = new RestTemplate();
    @Test
    public void test3(){
    	try {
    		  String url = "http://localhost:8082/hello/test.do";
    	        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>(); 
    	        map.add("name", "Tom");  
    	        String result = template.postForObject(url, map, String.class);
    	        System.out.println(result);
    	      
    	}catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
    	}
      
    }

    @Rule
    // 这里注意，使用@Rule注解必须要用public
    public OutputCapture capture = new OutputCapture();
    @Test
    public void test4(){
        System.out.println("HelloWorld");
        logger.info("logo日志也会被capture捕获测试输出");
    }

}