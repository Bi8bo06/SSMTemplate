package com.dsq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author daishq
 * @date: 2022/5/18 9:40
 * @description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private int sex;

    private StudentCard studentCard;
}
