package com.morty.c137.biz.impl;

import com.morty.c137.biz.JobBiz;
import com.morty.c137.dao.JobMapper;
import com.morty.c137.po.Job;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JobBizImpl implements JobBiz {

    @Resource
    private JobMapper jobMapper;

    @Override
    public Boolean saveJob(Job job) {

        if (job == null) {
            return false;
        }
        return jobMapper.insertSelective(job) > 0;
    }
}
