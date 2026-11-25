package com.hakoniwa.mapper;

import com.hakoniwa.entity.Work;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WorkMapper {

    @Select("SELECT id, title, type, summary FROM work")
    List<Work> findAll();
}