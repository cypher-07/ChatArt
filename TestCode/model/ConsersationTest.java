package com.faisal.chatart.model;

import junit.framework.TestCase;

import java.util.ArrayList;

public class ConsersationTest extends TestCase {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    Consersation consersation = new Consersation();

    public void testGetListMessageData() {
        ArrayList output;
        output = consersation.getListMessageData();
        assertEquals(myNumbers,output);
    }
}