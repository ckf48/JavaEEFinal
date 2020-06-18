package com.javaee.demo.service;

import com.javaee.demo.mapper.StudentHomeworkMapper;
import com.javaee.demo.model.StudentHomework;
import com.javaee.demo.model.StudentHomeworkExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentHomeworkService {
    @Resource
    private StudentHomeworkMapper studentHomeworkMapper;

    public String setStudentHomework(StudentHomework record) {
        studentHomeworkMapper.insert(record);
        return "成功提交作业";
    }

    public String updateStudentHomework(StudentHomework record){
        studentHomeworkMapper.updateByPrimaryKeyWithBLOBs(record);
        return "成功修改";
    }

    public List<StudentHomework> getStudentHomeworkList(){
        StudentHomeworkExample example = new StudentHomeworkExample();
        return studentHomeworkMapper.selectByExample(example);
    }
}
