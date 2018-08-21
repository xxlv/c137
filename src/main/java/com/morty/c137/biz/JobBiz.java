package com.morty.c137.biz;

import com.morty.c137.po.Job;
import org.springframework.stereotype.Service;

public interface JobBiz {

    public Job getJob(int id);

    public Boolean saveJob(Job job);

    public Boolean updateJob(Job job);

    public Boolean deleteJob(int id);
}
