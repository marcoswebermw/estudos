package br.com.mw.androidexemploslayout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.telephony.SmsMessage;
import android.widget.Toast;
import br.com.mw.androidexemploslayout.dao.AlunoDAO;

public class SMSReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context contexto, Intent intencao) {
		Object[] mensagens = (Object[]) intencao.getExtras().get("pdus");
		
		byte[] primeiraMsg = (byte[]) mensagens[0];
		
		SmsMessage sms = SmsMessage.createFromPdu(primeiraMsg);
		
		String telefone = sms.getDisplayOriginatingAddress();
	
//		Toast.makeText(contexto, "Sms do telefone: " + telefone, Toast.LENGTH_LONG).show();

		AlunoDAO dao = new AlunoDAO(contexto);
		boolean eAluno = dao.isAluno(telefone);
		
		dao.close();
		
		if (eAluno) {
			MediaPlayer player = MediaPlayer.create(contexto, R.raw.msg);
			player.start();
			Toast.makeText(contexto, "Tocando uma música...", Toast.LENGTH_LONG).show();
		}
	}

}
