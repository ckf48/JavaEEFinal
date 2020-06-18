package com.javaee.demo.service;

import com.javaee.demo.mapper.StudentMapper;
import com.javaee.demo.model.Student;
import com.javaee.demo.model.StudentExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService {
    @Resource
    private StudentMapper studentMapper;

    public String signUp(Student record) {
        StudentExample example = new StudentExample();
        example.createCriteria().andNameEqualTo(record.getName());
        if (studentMapper.selectByExample(example).size() != 0) {
            return "用户已存在";
        }
        studentMapper.insert(record);
        return "注册成功";
    }

    public Student signIn(String name) {
        StudentExample example = new StudentExample();
        example.createCriteria().andNameEqualTo(name);
        return studentMapper.selectByExample(example).get(0);
    }
}
