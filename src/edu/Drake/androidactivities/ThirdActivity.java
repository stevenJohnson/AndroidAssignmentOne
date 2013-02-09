package edu.Drake.androidactivities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class ThirdActivity extends Activity {
	TextView tv;
	Button plus;
	Button minus;
	int i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		
		tv = (TextView)findViewById(R.id.textView2);
		
		plus = (Button) findViewById(R.id.button1);
		plus.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v)
			{
				i++;
				tv.setText((CharSequence)String.valueOf(i), BufferType.NORMAL);
			}
		});
		
		minus = (Button) findViewById(R.id.button2);
		minus.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v)
			{
				i--;
				tv.setText((CharSequence)String.valueOf(i), BufferType.NORMAL);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_third, menu);
		return true;
	}

}
