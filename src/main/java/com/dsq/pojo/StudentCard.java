package com.dsq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author daishq
 * @date: 2022/5/18 9:42
 * @description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentCard {
    private int id;
    private int studentId;
    private Date StartDate;
    private Date endDate;
}
