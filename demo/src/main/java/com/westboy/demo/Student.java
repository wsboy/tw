package com.westboy.demo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @JsonProperty("student_name")
    private String studentName;
    @JsonProperty("student_age")
    private int studentAge;
}
