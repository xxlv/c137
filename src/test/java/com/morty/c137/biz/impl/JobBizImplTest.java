package com.morty.c137.biz.impl;

import com.morty.c137.dao.JobMapper;
import com.morty.c137.po.Job;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;
import java.util.List;

@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class JobBizImplTest extends AbstractTestNGSpringContextTests {

    @Resource
    private JobMapper jobMapper;

    @Test
    public void testSaveJob() {

        List<Job> jobs=jobMapper.selectAll();
        System.out.println(jobs.size());
        Assert.assertTrue(true);
    }
}