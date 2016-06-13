package com.bbgo.appbroadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btEnviar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Envia uma mensagem de broadcast para algum BroadcastReceiver.
                        sendBroadcast(new Intent("BINGO"));
        Toast.makeText(this, "Intent enviada!", Toast.LENGTH_SHORT).show();
    }
}
