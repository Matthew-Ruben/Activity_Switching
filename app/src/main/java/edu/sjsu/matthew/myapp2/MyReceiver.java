package edu.sjsu.matthew.myapp2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent();
        intent.setAction("edu.sjsu.matthew.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
