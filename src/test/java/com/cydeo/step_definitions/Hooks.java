package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/*
In this class we will be able to create "pre" and "post" condition
for ALL the SCENARIOS and even STEPS.
        */
public class Hooks {


    //import the @Before coming from io.cucumber.java
    @Before (order = 1)
    public void setupMethod() {
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

   // @Before (value = "@login", order = 2) // will only be applied to the login scenarios that has the login tags
    public void login_scenario_before() {
        System.out.println("-----> @BeforeSTEP : Running before each step!");
    }

    @After
    public void teardownMethod() {
        System.out.println("-----> @AfterSTEP : Running after each step!");
    }
/*

    //@BeforeStep
    public void setupStep(){
        System.out.println("-----> @BeforeSTEP : Running before each step!");
    }
*/


}
