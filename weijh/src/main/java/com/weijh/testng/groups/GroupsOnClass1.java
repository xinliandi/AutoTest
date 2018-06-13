package com.weijh.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1() {
        System.out.println("GroupsOnClass1  stu1 running");
    }

    public void stu2() {
        System.out.println("GroupsOnClass1  stu2 running");
    }
}
