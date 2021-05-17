package com.faisal.chatart.model;



public class User {
    public String name;
    public String email;
    public String avata;
    public Status status;
    public Message message;
    public String password;


    public User(){
        status = new Status();
        message = new Message();
        status.isOnline = false;
        status.timestamp = 0;
        message.idReceiver = "0";
        message.idSender = "0";
        message.text = "";
        message.timestamp = 0;
    }
    public boolean registration(String email,String username, String password) {
        this.password = password;
        this.name = username;
        this.email = email;
        return true;
    }
    public boolean login(String email, String password) {
        if(email==this.email && password == this.password) {
            return true;
        }
        return false;
    }
}
