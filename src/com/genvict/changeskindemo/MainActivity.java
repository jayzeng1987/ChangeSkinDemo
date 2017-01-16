package com.genvict.changeskindemo;

import com.genvict.changeskin.SkinManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button mBtnTest;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SkinManager.getInstance().register(this);
		
		setContentView(R.layout.activity_main);
		
		mBtnTest = (Button) findViewById(R.id.btnTest);
		mBtnTest.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				startActivity(intent);
			}
		});
		
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		SkinManager.getInstance().unregister(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {	
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.default_skin) {
			SkinManager.getInstance().changeSkin("default");
			return true;
		}
		
		if (id == R.id.green_skin) {
			SkinManager.getInstance().changeSkin("green");
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}
}
