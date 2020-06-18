package com.javaee.demo.mapper;

import com.javaee.demo.model.StudentHomework;
import com.javaee.demo.model.StudentHomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentHomeworkMapper {
    long countByExample(StudentHomeworkExample example);

    int deleteByExample(StudentHomeworkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentHomework record);

    int insertSelective(StudentHomework record);

    List<StudentHomework> selectByExampleWithBLOBs(StudentHomeworkExample example);

    List<StudentHomework> selectByExample(StudentHomeworkExample example);

    StudentHomework selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentHomework record, @Param("example") StudentHomeworkExample example);

    int updateByExampleWithBLOBs(@Param("record") StudentHomework record, @Param("example") StudentHomeworkExample example);

    int updateByExample(@Param("record") StudentHomework record, @Param("example") StudentHomeworkExample example);

    int updateByPrimaryKeySelective(StudentHomework record);

    int updateByPrimaryKeyWithBLOBs(StudentHomework record);

    int updateByPrimaryKey(StudentHomework record);
}