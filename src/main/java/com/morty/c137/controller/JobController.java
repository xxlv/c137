package com.morty.c137.controller;

import com.morty.c137.biz.JobBiz;
import com.morty.c137.po.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Resource
    private JobBiz jobBiz;

    @GetMapping
    public String index()
    {
        Job job=new Job();
        job.setName("name");
        job.setDesc("desc");
        job.setUpdateTime(new Date());
        job.setCreateTime(new Date());
        jobBiz.saveJob(job);
        return "create new job "+job.getId();
    }
}
