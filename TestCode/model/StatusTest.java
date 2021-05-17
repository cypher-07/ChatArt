package com.faisal.chatart.model;

import junit.framework.TestCase;

public class StatusTest extends TestCase {
    Status s = new Status();

    public void testgetStatus() {
        assertEquals(false,s.getStatus());
    }
    public void testchangeStatus() {
        assertTrue(s.changeStatus());
    }
}
