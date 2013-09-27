package com.example.app2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	public void metodo(View v)
	{
	Intent i = new Intent(this, SecondActivity.class);
	String w = "dato";
	i.putExtra("x",w);
    i.putExtra("z", 2);
	//this.startActivity(i);
	this.startActivityForResult(i, 0);
	
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	   String  x = data.getStringExtra("x");	
	}
	
	
}
