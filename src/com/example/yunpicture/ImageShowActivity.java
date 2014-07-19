package com.example.yunpicture;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ImageShowActivity extends Activity {
//	final ImageButton btn_default = (ImageButton) findViewById(R.id.btn_filter_default);
//	final ImageButton btn_bn = (ImageButton) findViewById(R.id.btn_filter_bw);
//	final ImageButton btn_wave = (ImageButton) findViewById(R.id.btn_filter_wave);
//	final ImageButton btn_textWatermark = (ImageButton) findViewById(R.id.btn_filter_textwatermark);
//	final ImageButton btn_imgWatermark = (ImageButton) findViewById(R.id.btn_filter_imgwatermark);
//	
//	final TextView tv_default = (TextView) findViewById(R.id.tv_default);
//	final TextView tv_bw = (TextView) findViewById(R.id.tv_bw);
//	final TextView tv_wave = (TextView) findViewById(R.id.tv_wave);
//	final TextView tv_textWatermark = (TextView) findViewById(R.id.tv_textwatermark);
//	final TextView tv_imgWatermark = (TextView) findViewById(R.id.tv_imgwatermark);
	Bitmap sourceBitmap;
	Bitmap thumbnailBitmap;
	
	private static String[] textData = new String[]{
		"text #1",
		"text #2",
		"text #3"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.pic1);
		
		Intent intent = getIntent();
		if (intent != null) {
			sourceBitmap = intent.getParcelableExtra("bitmap");
			ImageView tempView = (ImageView) findViewById(R.id.imageView1);
			tempView.setImageBitmap(sourceBitmap);
		}
		
		this.setTextDefaultColor();
		final TextView tv_default = (TextView) findViewById(R.id.tv_default);
		tv_default.setTextColor(Color.WHITE);
		this.initListener();
		
	}
	
	/**
	 *  set textview default color
	 */
	private void setTextDefaultColor(){
//		final ImageButton btn_default = (ImageButton) findViewById(R.id.btn_filter_default);
//		final ImageButton btn_bn = (ImageButton) findViewById(R.id.btn_filter_bw);
//		final ImageButton btn_wave = (ImageButton) findViewById(R.id.btn_filter_wave);
//		final ImageButton btn_textWatermark = (ImageButton) findViewById(R.id.btn_filter_textwatermark);
//		final ImageButton btn_imgWatermark = (ImageButton) findViewById(R.id.btn_filter_imgwatermark);
		
		final TextView tv_default = (TextView) findViewById(R.id.tv_default);
		final TextView tv_bw = (TextView) findViewById(R.id.tv_bw);
		final TextView tv_wave = (TextView) findViewById(R.id.tv_wave);
		final TextView tv_textWatermark = (TextView) findViewById(R.id.tv_textwatermark);
		final TextView tv_imgWatermark = (TextView) findViewById(R.id.tv_imgwatermark);
		
		tv_default.setTextColor(Color.GRAY);
		tv_bw.setTextColor(Color.GRAY);
		tv_imgWatermark.setTextColor(Color.GRAY);
		tv_textWatermark.setTextColor(Color.GRAY);
		tv_wave.setTextColor(Color.GRAY);
	}
	
	/**
	 *  set clicked event
	 */
	private void initListener(){
		final ImageButton btn_default = (ImageButton) findViewById(R.id.btn_filter_default);
		final ImageButton btn_bnw = (ImageButton) findViewById(R.id.btn_filter_bw);
		final ImageButton btn_wave = (ImageButton) findViewById(R.id.btn_filter_wave);
		final ImageButton btn_textWatermark = (ImageButton) findViewById(R.id.btn_filter_textwatermark);
		final ImageButton btn_imgWatermark = (ImageButton) findViewById(R.id.btn_filter_imgwatermark);
		
		final TextView tv_default = (TextView) findViewById(R.id.tv_default);
		final TextView tv_bw = (TextView) findViewById(R.id.tv_bw);
		final TextView tv_wave = (TextView) findViewById(R.id.tv_wave);
		final TextView tv_textWatermark = (TextView) findViewById(R.id.tv_textwatermark);
		final TextView tv_imgWatermark = (TextView) findViewById(R.id.tv_imgwatermark);
		
		btn_default.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageShowActivity.this.setTextDefaultColor();
				final TextView tv_default = (TextView) findViewById(R.id.tv_default);
				tv_default.setTextColor(Color.WHITE);
				
				//设置原片点击事件
			}
		});
		
		btn_bnw.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageShowActivity.this.setTextDefaultColor();
				final TextView tv_bnw = (TextView) findViewById(R.id.tv_bw);
				tv_bnw.setTextColor(Color.WHITE);
				
				//设置黑白点击事件
			}
		});
		
		btn_imgWatermark.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageShowActivity.this.setTextDefaultColor();
				final TextView tv_imgWatermark = (TextView) findViewById(R.id.tv_imgwatermark);
				tv_imgWatermark.setTextColor(Color.WHITE);
				
				//设置图片水印点击事件
			}
		});
		
		btn_textWatermark.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageShowActivity.this.setTextDefaultColor();
				final TextView tv_textWatermark = (TextView) findViewById(R.id.tv_textwatermark);
				tv_textWatermark.setTextColor(Color.WHITE);
				
				//设置文字水印点击事件
			}
		});
		
		btn_wave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageShowActivity.this.setTextDefaultColor();
				final TextView tv_wave = (TextView) findViewById(R.id.tv_wave);
				tv_wave.setTextColor(Color.WHITE);
				
				//设置正弦扭曲点击事件
			}
		});
		
		
	}
	
	private BaseAdapter mAdapter = new BaseAdapter() {
		
		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return textData.length;
		}
	};
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		super.onCreateOptionsMenu(menu);
		
		menu.add(Menu.NONE, Menu.FIRST + 1, 1, "缩放");
		menu.add(Menu.NONE, Menu.FIRST + 2, 2, "切割");
		menu.add(Menu.NONE, Menu.FIRST + 3, 3, "保存");
		menu.add(Menu.NONE, Menu.FIRST + 4, 4, "取消");
		
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		//Todo
		switch(item.getItemId()){
		
		/*
		 * 缩放事件
		 */
		case Menu.FIRST + 1:
            
		new AlertDialog.Builder(this)
		.setTitle("请选择")
		.setIcon(android.R.drawable.ic_dialog_info)                
		.setSingleChoiceItems(new String[] {"按比例缩放","指定宽度"}, 0, 
		  new DialogInterface.OnClickListener() {
		                            
		     public void onClick(DialogInterface dialog, int which) {
		    	 dialog.dismiss();
		    	 if(which == 0){
		    		 showProportionZoomDialpg();
		    	 }else if (which == 1) {
					showFixZoomDialog();
				}
		     }
		  }
		)
		.setNegativeButton("取消", null)
		.show();
			break;
		
		/*
		 *  
		 */
		case Menu.FIRST + 2:
			
		new AlertDialog.Builder(this)
		.setTitle("请选择")
		.setIcon(android.R.drawable.ic_dialog_info)                
		.setSingleChoiceItems(new String[] {"按像素","指行列数"}, 0, 
		  new DialogInterface.OnClickListener() {
		                            
		     public void onClick(DialogInterface dialog, int which) {
		    	 dialog.dismiss();
		    	 if(which == 0){
		    		 
		    	 }else if (which == 1) {
					
				}
		     }
		  }
		)
		.setNegativeButton("取消", null)
		.show();
			break;
		
		case Menu.FIRST + 3:
			
			break;
		
		//点击取消，不需做处理
		case Menu.FIRST + 4:
			break;
		default:
			break;
		}
		
		
		return false;
	}
	
	/*
	 *  设定按比例缩放对话框
	 */
	private void showProportionZoomDialpg(){
		final EditText propEditText = new EditText(this);
		
		new AlertDialog.Builder(this)
		.setTitle("请输入缩放比例")
		.setIcon(android.R.drawable.ic_dialog_info)
		.setView(propEditText)
		.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				double zoomData = Double.parseDouble(propEditText.getText().toString());
				
				//在此进行缩放
				
			}
		})
		.setNegativeButton("取消", null)
		.show();
		
	}
	
	/*
	 * 	设定指定宽度高度对话框
	 */
	private void showFixZoomDialog(){
		pzDialog pz_dialog = new pzDialog(this);
		pz_dialog.setTitle("请设置缩放比例");
		pz_dialog.show();
		
		/*
		 *  高度和宽度数据在pzDialog类中获取，可在其中运行效果
		 */
	}
}