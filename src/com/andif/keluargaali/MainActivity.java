package com.andif.keluargaali;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {

	GridView gridView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Toast.makeText(getBaseContext(), "Hai, Apa Kabar Semua...",Toast.LENGTH_LONG).show();
		
		setContentView(R.layout.activity_main);
		
		gridView = (GridView) findViewById(R.id.gridview_followed);
		gridView.setAdapter(new ImageAdapter(this));
		gridView.setOnItemClickListener(this);
	}


	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		Toast.makeText(getBaseContext(), ImageAdapter.thumbString[position],Toast.LENGTH_SHORT).show();
		Intent i = new Intent(this,SingleImage.class);
		Bundle b = new Bundle();
		b.putInt("position",position);
		i.putExtras(b);
		startActivity(i);
			
	}
	
	@Override
	public void onDestroy() {
	    super.onDestroy();
	    Runtime.getRuntime().gc();      
	}

}
