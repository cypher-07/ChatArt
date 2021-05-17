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

    Friend f1 = new Friend("1007");
    Friend f2 = new Friend("111");
    ArrayList<Friend> myFriends2 = new ArrayList<Friend>();
    ListFriend listfriend2 = new ListFriend();
    public void testTotal() {
        myFriends2.add(f1);
        myFriends2.add(f2);
        listfriend2.setListFriend(myFriends2);
        assertEquals(1007+111,listfriend2.total());
    }

}