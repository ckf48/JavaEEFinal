package com.javaee.demo.controller;

import com.javaee.demo.model.StudentHomework;
import com.javaee.demo.service.StudentHomeworkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api("学生作业相关")
@RestController
@RequestMapping("/studentHomework")
public class StudentHomeworkController {
    @Resource
    private StudentHomeworkService studentHomeworkService;

    @ApiOperation("学生提交作业")
    @PostMapping("/release")
    public String setStudentHomework(@RequestBody StudentHomework record) {
        return studentHomeworkService.setStudentHomework(record);
    }

    @ApiOperation("修改作业")
    @PostMapping("/update")
    public String updateStudentHomework(@RequestBody StudentHomework record) {
        return studentHomeworkService.updateStudentHomework(record);
    }

    @ApiOperation("获取所有提交的作业")
    @PostMapping("/getAllStudentHomework")
    public List<StudentHomework> getAllStudentHomework() {
        return studentHomeworkService.getStudentHomeworkList();
    }

}
