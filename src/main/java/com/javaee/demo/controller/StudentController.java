package com.javaee.demo.controller;

import com.javaee.demo.model.Student;
import com.javaee.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api("学生")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;


    @PostMapping("/signIn")
    @ApiOperation("学生登录")
    public Student signIn(@RequestBody Student record) {
        return studentService.signIn(record.getName());
    }

    @PostMapping("/signUp")
    @ApiOperation("学生注册")
    public String signUp(@RequestBody Student record) {
        return studentService.signUp(record);
    }
}
