package com.javaee.demo.controller;

import com.javaee.demo.model.Student;
import com.javaee.demo.model.Teacher;
import com.javaee.demo.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api("老师")
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @ApiOperation("老师注册")
    @PostMapping("/signUp")
    public String signUp(@RequestBody Teacher record) {
        return teacherService.signUp(record);
    }

    @ApiOperation("老师登录")
    @PostMapping("/signIn")
    public Teacher signIn(@RequestBody Teacher record) {
        return teacherService.signIn(record.getName());
    }
}
