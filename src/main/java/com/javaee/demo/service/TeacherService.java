package com.javaee.demo.service;

import com.javaee.demo.mapper.TeacherMapper;

import com.javaee.demo.model.Teacher;
import com.javaee.demo.model.TeacherExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    public String signUp(Teacher record) {
        TeacherExample example = new TeacherExample();
        example.createCriteria().andNameEqualTo(record.getName());
        if (teacherMapper.selectByExample(example).size() != 0) {
            return "用户已存在";
        }
        teacherMapper.insert(record);
        return "注册成功";
    }

    public Teacher signIn(String name) {
        TeacherExample example = new TeacherExample();
        example.createCriteria().andNameEqualTo(name);
        return teacherMapper.selectByExample(example).get(0);
    }
}
