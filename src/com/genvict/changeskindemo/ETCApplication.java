package com.genvict.changeskindemo;


import com.genvict.changeskin.SkinManager;

import android.app.Application;

public class ETCApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		SkinManager.getInstance().init(this);
	}
}
