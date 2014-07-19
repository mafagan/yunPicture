package com.example.yunpicture;

import java.io.IOException;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button btn1;
	private final String IMAGE_TYPE = "image/*"; 
	//private Boolean judge;
	private final int IMAGE_CODE = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 =(Button)findViewById(R.id.button1); 
		btn1.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View v) { 
				Intent getAlbum = new Intent(Intent.ACTION_GET_CONTENT); 
				getAlbum.setType(IMAGE_TYPE); 
				startActivityForResult(getAlbum, IMAGE_CODE);
			} 
		}); 	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		super.onCreateOptionsMenu(menu);
		return true;
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data){ 
		if (resultCode != RESULT_OK) { //此处的 RESULT_OK 是系统自定义得一个常量 
			// Log.e(TAG,"ActivityResult resultCode error"); 
			return; 
		} 
		ContentResolver resolver = getContentResolver(); 
		if (requestCode == IMAGE_CODE) { 
			try { 
				Bitmap bm;
				Uri originalUri = data.getData(); //获得图片的uri 
				bm = MediaStore.Images.Media.getBitmap(resolver, originalUri); //显得到bitmap图片 
				// 这里开始的第二部分，获取图片的路径： 
				String[] proj = {MediaStore.Images.Media.DATA}; 
				Cursor cursor = managedQuery(originalUri, proj, null, null, null); 
				//按我个人理解 这个是获得用户选择的图片的索引值 
				int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA); 
				cursor.moveToFirst(); 
				//最后根据索引值获取图片路径 
				String path = cursor.getString(column_index); 
				//txt1=(TextView)findViewById(R.id.text);
				//txt1.setText(path);
				System.out.println(path);
				Log.e("Lostinai",path);
				
				Intent intent = new Intent(MainActivity.this, ImageShowActivity.class);
				intent.putExtra("path", path);
				startActivity(intent);
			}catch (IOException e) { 
				Log.e("Lostinai",e.toString()); 
			} 
		} 
	} 

}
