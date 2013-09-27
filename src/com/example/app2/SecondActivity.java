package com.example.app2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Intent i = this.getIntent();
		String x1 = i.getStringExtra("x");
		int x2 = i.getIntExtra("z", 0);
		Toast t =Toast.makeText(this, x1+" "+x2, 3000);
		t.show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}
	public void metodo(View v)
	{
	Intent i = new Intent();
	i.putExtra("x","dato1");
	this.setResult(0, i);
	this.finish();
	 
	}


}
