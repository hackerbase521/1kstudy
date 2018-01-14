package com.example.broadcasttest.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/1/13.
 */
public class MyReceive extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"我收到了一条广播消息111"+intent.getAction(),Toast.LENGTH_LONG).show();
    }
}
