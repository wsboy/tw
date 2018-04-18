package com.westboy.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class FasterxmlDemo {
    public static void main(String[] args) throws IOException {
        Student student = new Student("westboy", 18);
        String jsonStr = new ObjectMapper().writeValueAsString(student);
        System.out.println(new ObjectMapper().readValue(jsonStr.getBytes(), Student.class));
    }
}
