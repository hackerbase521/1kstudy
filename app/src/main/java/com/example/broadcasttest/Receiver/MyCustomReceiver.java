package com.example.broadcasttest.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/1/13.
 */
public class MyCustomReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"我收到了一条自定义广播"+intent.getAction(),Toast.LENGTH_LONG).show();
    }
}
