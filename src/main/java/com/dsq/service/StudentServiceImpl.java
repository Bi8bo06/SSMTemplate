package com.dsq.service;

import com.dsq.dao.BookMapper;
import com.dsq.dao.StudentMapper;
import com.dsq.pojo.Student;
import com.dsq.pojo.Teacher;

/**
 * @author daishq
 * @date: 2022/5/18 10:16
 * @description:
 */
public class StudentServiceImpl implements StudentService {
    //service 调dao层
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public Student queryStuById(int id) {
        return studentMapper.queryStuById(id);
    }

    public Teacher queryTeaById(int id) {
        return studentMapper.queryTeaById(id);
    }
}
