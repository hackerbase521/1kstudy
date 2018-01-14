package com.example.broadcasttest;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.broadcasttest.Receiver.MyCustomReceiver;
import com.example.broadcasttest.Receiver.NetworkChangeReceiver;

public class FirstActivity extends AppCompatActivity {
    private NetworkChangeReceiver networkChangeReceiver;
    private MyCustomReceiver myCustomReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_layout);
        registerAllReceiver();
        sendBroadcast(new Intent("MyBroadCast"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(networkChangeReceiver);
        unregisterReceiver(myCustomReceiver);
    }
    public void registerAllReceiver(){
        networkChangeReceiver = new NetworkChangeReceiver();
        myCustomReceiver = new MyCustomReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(networkChangeReceiver,intentFilter);
        registerReceiver(myCustomReceiver,new IntentFilter("MyBroadCast"));
    }
}
