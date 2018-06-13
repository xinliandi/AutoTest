package com.weijh.testng;

import org.testng.annotations.Test;

public class Exception {
    //这是一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("failed!!!!!!");
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("success!!!!!!!!");
        throw new RuntimeException();

    }
}
