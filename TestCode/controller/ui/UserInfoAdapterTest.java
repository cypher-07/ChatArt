package com.faisal.chatart.controller.ui;

import com.faisal.chatart.model.Configuration;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class UserInfoAdapterTest extends TestCase {

    private List<Configuration> profileConfig = new ArrayList<>();
    Configuration con1 = new Configuration("Arman","07",1);
    Configuration con2 = new Configuration("Rayoon","10",2);
    Configuration con3 = new Configuration("Shakil","11",3);

    UserProfileFragment userprofile = new UserProfileFragment();

    public void testGetItemCount() {
        profileConfig.add(con1);
        profileConfig.add(con2);
        profileConfig.add(con3);
        UserProfileFragment.UserInfoAdapter userinfoadapter = userprofile.new UserInfoAdapter(profileConfig);
        int output;
        output = userinfoadapter.getItemCount();
        assertEquals(3,output);
    }

}
