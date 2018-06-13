package com.weijh.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void brforeSuite(){
         System.out.println("beforesuite运行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("aftersuite运行");
    }
    @BeforeTest
    public void beforeTest(){
         System.out.println("beforetest运行");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("aftertest运行");
    }
}
