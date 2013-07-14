package com.andif.keluargaali;


import android.R.integer;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class SoundBase extends Service {
	MediaPlayer media;
	public static int[] resource = {
		R.raw.ali,R.raw.papah_handsome,R.raw.mamah,R.raw.papahandali,R.raw.mamahali,
		R.raw.mbahkumis,R.raw.dino,R.raw.santo,R.raw.gopar,R.raw.ita,
		R.raw.aisyah,R.raw.pipin,R.raw.atta,R.raw.lila,R.raw.jordan,R.raw.farel,R.raw.marni,
		R.raw.nina,R.raw.cici,R.raw.surya
	};
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override 
	public void onCreate(){
		media = new MediaPlayer();
	}
	
	
	 @Override
	  public int onStartCommand(Intent intent, int flags, int startId) {
	    //TODO do something useful
		 Bundle extras =  intent.getExtras();
		 int position = (Integer) extras.get("position"); 
		 media = MediaPlayer.create(this,SoundBase.resource[position]);
		 media.setLooping(false);
		 media.start();		 
		// Toast.makeText(this,position,Toast.LENGTH_LONG).show();
	    return Service.START_STICKY;
	  }
	
	 @Override
		public void onDestroy(){
			media.stop();
			media.release();
		}
}
