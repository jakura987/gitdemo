package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
}
