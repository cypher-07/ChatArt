package com.faisal.chatart.model;

import junit.framework.TestCase;

public class UserTest extends TestCase {
    User rayoon = new User();
    public UserTest() {
        rayoon.registration("wontcheckyourmail@gmail.com","Ahmen Ann Noor Ryen","dushtu_ryen");
    }
    public void testRegistration() {
        User arman = new User();
        boolean output = arman.registration("tormujarman@gmail.com","Arman Hossain","I love Tormuj");
        assertTrue(output);
    }
    public void testLogin() {
        assertTrue(rayoon.login("wontcheckyourmail@gmail.com","dushtu_ryen"));
    }
}
