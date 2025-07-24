package com.sky.aspect;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 自定义切面类，用于实现公共字段自动填充的逻辑实现
 */
@Aspect
@Component
@Slf4j
public class AutoFillAspect {
    //切入点
    @Pointcut("execution(* com.sky.mapper.*.*(..)) && @annotation(com.sky.annotation.AutoFill)")
    public void autoFillPointCut() {
    }

    //前置通知，在运行时进行公共字段的填充
    @Before("autoFillPointCut()")
    public void autoFill(JoinPoint joinPoint) {
        log.info("Auto fill start");
    }

}
