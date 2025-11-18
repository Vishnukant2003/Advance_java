package com.itshaala.springbootjdbc001.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Student {
    private int id;
    private String name;
    private String course;
}
