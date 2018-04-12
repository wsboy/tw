package com.westboy.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
@Slf4j
public class LogAspect {

    /**
     * 第一个 * 代表所有返回类型
     * 第二个 * 代表 com.westboy.controller 包下所有类
     * 第三个 * 代表所有方法
     * 最后一个 .. 代表所有的参数
     */
    @Pointcut("execution (* com.westboy.controller.*.*(..))")
    public void logPrint() {
    }

    @Before("logPrint()")
    public void doBefore(JoinPoint joinPoint) {

        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();

        System.out.println("123");
        log.info("targetName={},methodName={}", targetName, methodName);

    }


}
