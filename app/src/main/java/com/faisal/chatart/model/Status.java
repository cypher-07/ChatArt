package com.faisal.chatart.model;



public class Status{
    public boolean isOnline;
    public long timestamp;

    public Status(){
        isOnline = false;
        timestamp = 0;
    }
    public boolean changeStatus() {
        isOnline = true;
        return true;
    }
    public boolean getStatus() {
        return isOnline;
    }
}
