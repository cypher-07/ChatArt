package com.faisal.chatart.controller.ui;

import android.content.Context;

import com.faisal.chatart.model.Group;
import com.faisal.chatart.model.ListFriend;
import com.faisal.chatart.model.Message;

import junit.framework.TestCase;

import java.util.ArrayList;

public class ListGroupsAdapterTest extends TestCase {
    public static ListFriend listFriend = null;
    private Context context;

    ArrayList<Group> myGroup = new ArrayList<Group>();
    Group text1 = new Group();
    Group text2 = new Group();

    public ListGroupsAdapterTest() {
        myGroup.add(text1);
        myGroup.add(text2);
    }
    ListGroupsAdapter listgroupadapter = new ListGroupsAdapter(context,myGroup);
    public void testGetItemCount() {
        int output;
        output = listgroupadapter.getItemCount();
        assertEquals(2,output);
    }
}
