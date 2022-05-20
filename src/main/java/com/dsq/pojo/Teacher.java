package com.dsq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author daishq
 * @date: 2022/5/19 15:05
 * @description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int id;
    private int sex;
    private String name;
    private List<Student> studentList;
}
