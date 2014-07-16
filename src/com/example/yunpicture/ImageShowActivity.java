package com.example.yunpicture;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class ImageShowActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pic1);
		
		ListView filterListView = (ListView) findViewById(R.id.filterlv);
		ListItemAdapter filterAdapter = new ListItemAdapter(this);
		filterListView.setAdapter(filterAdapter);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		super.onCreateOptionsMenu(menu);
		
		menu.add("×óÐý×ª");
		
		return true;
	}
}