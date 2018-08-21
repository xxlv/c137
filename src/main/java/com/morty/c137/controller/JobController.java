package com.morty.c137.controller;

import com.morty.c137.biz.JobBiz;
import com.morty.c137.po.Job;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Resource
    private JobBiz jobBiz;

    @GetMapping
    public String index() {
        // TODO job 列表
        return "to do";
    }

    @GetMapping("/add")
    public String add() {
        Job job = new Job();
        job.setName("name");
        job.setDesc("desc");
        job.setUpdateTime(new Date());
        job.setCreateTime(new Date());
        jobBiz.saveJob(job);
        return "create new job " + job.getId();
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") Integer id, @RequestParam("name") String name,
                         @RequestParam("desc") String desc) {
        Job job = jobBiz.getJob(id);
        job.setName(name);
        job.setDesc(desc);
        job.setUpdateTime(new Date());
        jobBiz.updateJob(job);
        return "updated job " + job.getId();
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        jobBiz.deleteJob(id);
        return "deleted job " + id;
    }
}
