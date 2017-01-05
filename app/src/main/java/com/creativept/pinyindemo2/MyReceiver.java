package com.creativept.pinyindemo2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * 广播接收器，接收android.intent.idatachina.RFID.BARCODE.SCANINFO的广播，取出Intent中字段
 * "idatachina.SCAN_DATA"存储的数据，调用拼音服务PinyinIME发送给EditText
 * 
 * @ClassName MyReceiver
 * @author keanbin
 */
public class MyReceiver extends BroadcastReceiver {
	PinyinIME ss = new PinyinIME();

	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		// MainActivity.onrecvintend(intent);
		String tinfo = intent.getStringExtra("idatachina.SCAN_DATA");
		ss.pinyinIME.SetText(tinfo);

	}
}
