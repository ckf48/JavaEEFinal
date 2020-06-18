package com.javaee.demo.service;

import com.javaee.demo.mapper.HomeworkMapper;
import com.javaee.demo.model.Homework;
import com.javaee.demo.model.HomeworkExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HomeworkService {

    @Resource
    private HomeworkMapper homeworkMapper;

    public String setHomework(Homework record) {
        homeworkMapper.insert(record);
        return "成功发布作业";
    }

    public List<Homework> getHomeworkList() {
        HomeworkExample example = new HomeworkExample();
        return homeworkMapper.selectByExample(example);
    }

    public String updateHomework(Homework record){
        homeworkMapper.updateByPrimaryKeyWithBLOBs(record);
        return "成功修改";
    }
}
