package com.javaee.demo.controller;

import com.javaee.demo.model.Homework;
import com.javaee.demo.service.HomeworkService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@ApiOperation("布置作业相关")
@RequestMapping("/homework")
@RestController
public class HomeworkController {

    @Resource
    private HomeworkService homeworkService;

    @ApiOperation("发布作业")
    @PostMapping("/release")
    public String setHomework(@RequestBody Homework record) {
        return homeworkService.setHomework(record);
    }

    @ApiOperation("修改发布的作业")
    @PostMapping("/update")
    public String updateHomework(@RequestBody Homework record) {
        return homeworkService.updateHomework(record);
    }

    @ApiOperation("获取所有发布的作业")
    @PostMapping("/getAllHomework")
    public List<Homework> getAllHomework() {
        return homeworkService.getHomeworkList();
    }
}
