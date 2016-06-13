package com.bbgo.appbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by BBEIRIGO on 2016-05-24.
 */
public class HelloReceiver extends BroadcastReceiver {

    @Override
    //O receiver recebe o intent enviado por algum broadcast.
    // Verifique a configuração no manifest: quando alguma intent/mensagem com a ação BINGO
    // for disparada, a classe HelloReceiver será executada em segundo plano sem interferir
    // na tela em que o usuário está trabalhando.
    public void onReceive(Context context, Intent intent) {
        Log.d("RESULTADO", "Hello Receiver!!!");
    }

    //Atenção: a ação executada dentro do receiver não pode ultrapassar 10 segundos!
    //Ao terminar o método onReceive, o broadcast é destruído.
    //Tarefas demoradas devem ser encaminhadas a classe Service.
}
