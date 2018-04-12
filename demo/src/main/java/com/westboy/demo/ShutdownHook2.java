package com.westboy.demo;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.stream.IntStream;

public class ShutdownHook2 {
    public static void main(String[] args) {
        System.out.println(ShutdownHook2.class.getResource("hook.log"));
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter fw = new FileWriter("")) {
                // 假设记录日志/或者发送消息
                fw.write("完成销毁操作,回收内存! " + (new Date()).toString());
                fw.flush();
                fw.close();
                System.out.println("退出程序...");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        IntStream.range(0, 3).forEach(i -> {
            try {
                System.out.println(i + "正在工作...");
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
