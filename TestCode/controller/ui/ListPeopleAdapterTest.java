package com.faisal.chatart.controller.ui;

import android.content.Context;
import android.widget.LinearLayout;

import com.faisal.chatart.model.Friend;
import com.faisal.chatart.model.Group;
import com.faisal.chatart.model.ListFriend;
import com.faisal.chatart.model.Friend;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Set;

public class ListPeopleAdapterTest<a> extends TestCase {

    ArrayList<Friend> myFriends = new ArrayList<Friend>();
    Friend Arman = new Friend();
    Friend Rayoon = new Friend();
    public ListPeopleAdapterTest() {
        myFriends.add(Arman);
        myFriends.add(Rayoon);
    }
    ListFriend listfriend = new ListFriend();

    private Context context;
    private LinearLayout btnAddGroup;
    private Set<String> listIDChoose;
    private Set<String> listIDRemove;
    private boolean isEdit;
    private Group editGroup;

    ListPeopleAdapter listPeopleAdapter = new ListPeopleAdapter(context,listfriend,btnAddGroup,listIDChoose,listIDRemove,isEdit,editGroup);

    public void testGetItemCount() {
        listfriend.setListFriend(myFriends);
        int output;
        output = listPeopleAdapter.getItemCount();
        assertEquals(2,output);
    }
}