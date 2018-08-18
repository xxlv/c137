package com.morty.c137.biz.impl;

import com.morty.c137.dao.JobMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.morty.c137.po.Job;
import javax.annotation.Resource;
import java.util.Date;

@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class JobBizImplTest extends AbstractTestNGSpringContextTests {

    @Resource
    private JobMapper jobMapper;

    @Test
    public void testSaveJob() {

        int id=1;
        Job job=new Job();
        Job theJob=jobMapper.selectByPrimaryKey(id);
        if(theJob==null){
            job.setId(id);
            job.setCreateTime(new Date());
            job.setUpdateTime(new Date());
            job.setDesc("Desc");
            job.setName("Name");
            int refNu=jobMapper.insertSelective(job);
            Assert.assertEquals(refNu,1);
        }else{
            Assert.assertEquals(theJob.getId().intValue(),1);
        }
    }
}