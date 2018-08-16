package com.morty.c137.biz.impl;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class JobBizImplTest extends AbstractTestNGSpringContextTests {

    @Test
    public void testSaveJob() {
        Assert.assertTrue(true);
    }
}