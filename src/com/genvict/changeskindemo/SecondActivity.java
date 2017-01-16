package com.genvict.changeskindemo;

import com.genvict.changeskin.SkinManager;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SkinManager.getInstance().register(this);
		
		setContentView(R.layout.activity_second);	
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		SkinManager.getInstance().unregister(this);
	}
}
