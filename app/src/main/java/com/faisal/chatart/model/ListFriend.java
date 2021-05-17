package com.faisal.chatart.model;

import java.util.ArrayList;


public class ListFriend {
    private ArrayList<Friend> listFriend;

    public ArrayList<Friend> getListFriend() {
        return listFriend;
    }

    public ListFriend(){
        listFriend = new ArrayList<>();
    }

    public String getAvataById(String id){
        for(Friend friend: listFriend){
            if(id.equals(friend.id)){
                return friend.avata;
            }
        }
        return "";
    }
    public int total() {
        int sum = 0;
        for(int i=0; i<listFriend.size();i++) {
            sum = sum+ Integer.parseInt(listFriend.get(i).id);
        }
        return sum;
    }
    public void setListFriend(ArrayList<Friend> listFriend) {
        this.listFriend = listFriend;
    }
}
