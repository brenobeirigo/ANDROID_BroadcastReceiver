package com.bbgo.appbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/**
 * Created by BBEIRIGO on 2016-05-31.
 */
public class HelloWireless extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("net_info", "Network connectivity change");
        if (intent.getExtras() != null) {
            boolean noConnectivity = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);
            NetworkInfo info1 = (NetworkInfo) intent.getParcelableExtra(ConnectivityManager.EXTRA_NETWORK_INFO);
            NetworkInfo info2 = (NetworkInfo) intent.getParcelableExtra(ConnectivityManager.EXTRA_OTHER_NETWORK_INFO);
            String reason = intent.getStringExtra(ConnectivityManager.EXTRA_REASON);
            boolean failOver = intent.getBooleanExtra(ConnectivityManager.EXTRA_IS_FAILOVER, false);
            Log.d("net_stat", "onReceive(): mNetworkInfo=" + info1 + " mOtherNetworkInfo = " +
                    (info2 == null ? "[none]" : info2 + " noConn=" + noConnectivity));
        }


    }
}
