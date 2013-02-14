package edu.Drake.androidactivities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class FourthActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_fourth, menu);
		return true;
	}
	
	//When you click on the picture, it will send you back
	public void back(View v){
		finish();
	}

}
