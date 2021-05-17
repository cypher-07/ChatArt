package com.faisal.chatart.model;


import java.util.ArrayList;

public class Group extends Room{
    public String id;
    public ListFriend listFriend;

    public Group(){
        listFriend = new ListFriend();
    }
    public Group(ListFriend listFriend){
        this.listFriend = listFriend;
    }

    public int calculateGroupnumber() {
        return listFriend.total();
    }
}
