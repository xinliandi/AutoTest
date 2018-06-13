package com.weijh.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1() {
        System.out.println("GroupsOnClass3  teacher1 running");
    }

    public void teacher2() {
        System.out.println("GroupsOnClass3  teacher2 running");
    }

}
