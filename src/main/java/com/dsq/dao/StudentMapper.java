package com.dsq.dao;

import com.dsq.pojo.Books;
import com.dsq.pojo.Student;
import com.dsq.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author daishq
 * @date: 2022/5/18 9:45
 * @description:
 */
public interface StudentMapper {
    //查询一本书
    Student queryStuById(@Param("id") int id);

    //查询老师名下的学生
    Teacher queryTeaById(@Param("id") int id);
}
