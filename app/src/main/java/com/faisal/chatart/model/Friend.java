package com.faisal.chatart.model;



public class Friend extends User{
    public String id;
    public String idRoom;
    public Friend() {
    }
    public Friend(String id) {
        this.id = id;
    }
    public String getroom() {
        return "Room : "+this.id;
    }
}
