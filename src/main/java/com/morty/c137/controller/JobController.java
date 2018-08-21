package com.morty.c137.controller;

import com.github.pagehelper.PageInfo;
import com.morty.c137.biz.JobBiz;
import com.morty.c137.dto.request.QueryJobReqDto;
import com.morty.c137.po.Job;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Resource
    private JobBiz jobBiz;

    @GetMapping
    public PageInfo index() {
        // TODO params load from GET
        int id = 1;
        QueryJobReqDto queryJobReqDto = new QueryJobReqDto();
        queryJobReqDto.setId(id);
        //分页后的数据
        return jobBiz.listJobPaging(queryJobReqDto);
    }

    @GetMapping("/add")
    public Job add() {
        Job job = new Job();
        job.setName("name");
        job.setDesc("desc");
        job.setUpdateTime(new Date());
        job.setCreateTime(new Date());
        jobBiz.saveJob(job);
        return job;
    }

    @PostMapping("/update")
    public Job update(@RequestParam("id") Integer id, @RequestParam("name") String name,
                         @RequestParam("desc") String desc) {
        Job job = jobBiz.getJob(id);
        job.setName(name);
        job.setDesc(desc);
        job.setUpdateTime(new Date());
        jobBiz.updateJob(job);
        return job;
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable("id") int id) {
        return jobBiz.deleteJob(id);
    }
}
