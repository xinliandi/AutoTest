package com.weijh.testng.suite;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)//单位为毫秒
    public void tessSuccess() throws InterruptedException{
        Thread.sleep(2000);

    }
    @Test(timeOut = 2000)//单位为毫秒
    public void tessFailed() throws InterruptedException{
        Thread.sleep(3000);

    }
}
