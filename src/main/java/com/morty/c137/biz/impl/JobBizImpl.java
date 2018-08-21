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

    /**
     * save a job
     * @param job
     * @return
     */
    @Override
    public Boolean saveJob(Job job) {
        if (job == null) {
            return false;
        }
        return jobMapper.insertSelective(job) > 0;
    }

    /**
     * delete a job
     * @param id
     * @return
     */
    @Override
    public Boolean deleteJob(int id) {
        return jobMapper.deleteByPrimaryKey(1) > 0;
    }
}
