package com.faisal.chatart.model;

import junit.framework.TestCase;

import java.util.ArrayList;

public class GroupTest extends TestCase {
    Friend f1 = new Friend("1007");
    Friend f2 = new Friend("111");
    ArrayList<Friend> myFriends2 = new ArrayList<Friend>();
    ListFriend listfriend2 = new ListFriend();
    public void testcalculateGroupnumber() {
        myFriends2.add(f1);
        myFriends2.add(f2);
        listfriend2.setListFriend(myFriends2);
        Group group = new Group(listfriend2);
        assertEquals(1007+111,group.calculateGroupnumber());
    }
}
