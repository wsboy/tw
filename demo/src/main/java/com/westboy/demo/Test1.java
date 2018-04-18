package com.westboy.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        String[] values = new String[0];
        Map<String, String> map = new HashMap<>();
        map.put("name", "westboy");
        map.put("age", "18");
        map.put("null", null);
        values = map.values().toArray(values);
        Arrays.stream(values).forEach(System.out::println);
        values = map.keySet().toArray(values);
        Arrays.stream(values).forEach(System.out::println);
    }
}
