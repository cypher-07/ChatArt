package com.faisal.chatart.controller.ui;

import android.content.Context;
import android.graphics.Bitmap;

import com.faisal.chatart.model.Consersation;
import com.faisal.chatart.model.Friend;
import com.faisal.chatart.model.Message;
import com.google.firebase.database.DatabaseReference;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMessageAdapterTest extends TestCase {
    private Context context;
    private HashMap<String, Bitmap> bitmapAvata;
    private HashMap<String, DatabaseReference> bitmapAvataDB;
    private Bitmap bitmapAvataUser;


    ArrayList<Message> myMessage = new ArrayList<Message>();
    Message text1 = new Message();
    Message text2 = new Message();
    public ListMessageAdapterTest() {
        myMessage.add(text1);
        myMessage.add(text2);
    }
    Consersation consersation = new Consersation();
    ListMessageAdapter lma = new ListMessageAdapter(context, consersation, bitmapAvata, bitmapAvataUser);

    public void testGetItemCount() {
        consersation.setListMessageData(myMessage);
        int output;
        output = lma.getItemCount();
        assertEquals(2,output);
    }
}
