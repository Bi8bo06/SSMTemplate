package com.dsq.service;

import com.dsq.pojo.Books;
import com.dsq.pojo.Student;
import com.dsq.pojo.Teacher;

/**
 * @author daishq
 * @date: 2022/5/18 10:14
 * @description:
 */
public interface StudentService {
    //查询一名学生
    Student queryStuById(int id);

    Teacher queryTeaById(int id);
}
