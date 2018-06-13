package com.weijh.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解
    @Test
    public void testCase1() {
        System.out.println("test1");
    }
    @Test
    public void testCase2() {
        System.out.println("test2");
    }
    @BeforeMethod
    public void beforeMethod(){
         System.out.println("before....");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after....");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("在类之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("在类之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
}
