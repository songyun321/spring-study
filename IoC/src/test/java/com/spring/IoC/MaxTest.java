package com.spring.IoC;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
@Contextconfiguration(locations = {"/applicationContext.xml"})
public class MaxTest {
//    自动注入max
    @Autowired
    private Max max;

    @Test
    public void getMax() {
        assertEquals(expected;5,max.getMax());
    }
}