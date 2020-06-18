package com.javaee.demo.mapper;

import com.javaee.demo.model.Homework;
import com.javaee.demo.model.HomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomeworkMapper {
    long countByExample(HomeworkExample example);

    int deleteByExample(HomeworkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Homework record);

    int insertSelective(Homework record);

    List<Homework> selectByExampleWithBLOBs(HomeworkExample example);

    List<Homework> selectByExample(HomeworkExample example);

    Homework selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Homework record, @Param("example") HomeworkExample example);

    int updateByExampleWithBLOBs(@Param("record") Homework record, @Param("example") HomeworkExample example);

    int updateByExample(@Param("record") Homework record, @Param("example") HomeworkExample example);

    int updateByPrimaryKeySelective(Homework record);

    int updateByPrimaryKeyWithBLOBs(Homework record);

    int updateByPrimaryKey(Homework record);
}