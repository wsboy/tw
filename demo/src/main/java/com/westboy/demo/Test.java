package com.westboy.demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
    public static void main(String[] args) {
        String[] strings = new String[]{"china", "japan", "america"};
        List<String> list = new CopyOnWriteArrayList<>();

        try {

            Field field = CopyOnWriteArrayList.class.getDeclaredField("array");
            field.setAccessible(true);
            field.set(list, strings);

            Method method = list.getClass().getDeclaredMethod("getArray");
            method.setAccessible(true);
            String[] strings1 = (String[]) method.invoke(list);
            for (int i = 0, len = strings1.length; i < len; i++) {
                System.out.println(strings1[i]);
            }


        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }




        String[] strs = list.toArray(new String[0]);
        System.out.println("strs.length="+strs.length);
        for (int i = 0, len = strs.length; i < len; i++) {
            System.out.println(strs[i]);
        }
    }




}
