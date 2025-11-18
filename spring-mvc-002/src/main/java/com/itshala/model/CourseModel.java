package com.itshala.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString

public class CourseModel {
    private int id;
    private String name;
    private String duration;
    private int price;

}
