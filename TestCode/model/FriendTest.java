package com.faisal.chatart.model;

import junit.framework.TestCase;

public class FriendTest extends TestCase {
    Friend f1 = new Friend("1007");

    public void testgetroom() {
        String output;
        output = f1.getroom();
        assertEquals("Room : 1007",output);
    }
}
