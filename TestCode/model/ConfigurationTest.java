package com.faisal.chatart.model;

import junit.framework.TestCase;

public class ConfigurationTest extends TestCase {
    Configuration configuration = new Configuration("label","07",1);
    public void testGetLabel() {
        String output;
        output = configuration.getLabel();
        assertEquals("label",output);
    }

    public void testGetValue() {
        String output;
        output = configuration.getValue();
        assertEquals("07",output);
    }

    public void testGetIcon() {
        int output;
        output = configuration.getIcon();
        assertEquals(1,output);
    }
}