package com.faisal.chatart.model;

import junit.framework.TestCase;

import java.util.ArrayList;

public class ListFriendTest extends TestCase {
    ArrayList<Friend> myFriends = new ArrayList<Friend>();
    ListFriend listfriend = new ListFriend();

    public void testSetListFriend() {
        listfriend.setListFriend(myFriends);
        ArrayList output;
        output = listfriend.getListFriend();
        assertEquals(myFriends,output);
    }

    public void testGetListFriend() {
        listfriend.setListFriend(myFriends);
        ArrayList output;
        output = listfriend.getListFriend();
        assertEquals(myFriends,output);
    }

}