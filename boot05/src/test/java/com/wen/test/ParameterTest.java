package com.wen.test;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {

    private String name;
    private boolean result;

    /**
     * 该构造方法的参数与下面@Parameters注解的方法中的Object数组中值的顺序对应
     * @param name
     * @param result
     */
    public ParameterTest(String name, boolean result) {
        super();
        this.name = name;
        this.result = result;
    }

    @Test
    public void test() {
        assertTrue(name.contains("小") == result);
    }


    @Parameters
    public static Collection<?> data(){
        // Object 数组中值的顺序注意要和上面的构造方法ParameterTest的参数对应
        return Arrays.asList(new Object[][]{
            {"小明", true},
            {"小红", false},
            {"小莉", false},
        });
    }
}