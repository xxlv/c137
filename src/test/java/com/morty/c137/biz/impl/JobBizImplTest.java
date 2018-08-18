package com.morty.c137.biz.impl;

import com.morty.c137.dao.JobMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class JobBizImplTest extends AbstractTestNGSpringContextTests {

    @Resource
    private JobMapper jobMapper;

    @Test
    public void testSaveJob() {

        Long id=1L;
        Job job=new Job();
        Job theJob=jobMapper.selectByPrimaryKey(id);
        if(theJob==null){
            job.setId(1L);
            int refNu=jobMapper.insertSelective(job);
            Assert.assertEquals(refNu,1);
        }else{
            Assert.assertEquals(theJob.getId().longValue(),1L);
        }
    }
}