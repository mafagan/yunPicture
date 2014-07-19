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
				
				//����ԭƬ����¼�
			}
		});
		
		btn_bnw.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageShowActivity.this.setTextDefaultColor();
				final TextView tv_bnw = (TextView) findViewById(R.id.tv_bw);
				tv_bnw.setTextColor(Color.WHITE);
				
				//���úڰ׵���¼�
			}
		});
		
		btn_imgWatermark.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageShowActivity.this.setTextDefaultColor();
				final TextView tv_imgWatermark = (TextView) findViewById(R.id.tv_imgwatermark);
				tv_imgWatermark.setTextColor(Color.WHITE);
				
				//����ͼƬˮӡ����¼�
			}
		});
		
		btn_textWatermark.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageShowActivity.this.setTextDefaultColor();
				final TextView tv_textWatermark = (TextView) findViewById(R.id.tv_textwatermark);
				tv_textWatermark.setTextColor(Color.WHITE);
				
				//��������ˮӡ����¼�
			}
		});
		
		btn_wave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ImageShowActivity.this.setTextDefaultColor();
				final TextView tv_wave = (TextView) findViewById(R.id.tv_wave);
				tv_wave.setTextColor(Color.WHITE);
				
				//��������Ť������¼�
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
		
		menu.add(Menu.NONE, Menu.FIRST + 1, 1, "����");
		menu.add(Menu.NONE, Menu.FIRST + 2, 2, "�и�");
		menu.add(Menu.NONE, Menu.FIRST + 3, 3, "����");
		menu.add(Menu.NONE, Menu.FIRST + 4, 4, "ȡ��");
		
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		//Todo
		switch(item.getItemId()){
		
		/*
		 * �����¼�
		 */
		case Menu.FIRST + 1:
            
		new AlertDialog.Builder(this)
		.setTitle("��ѡ��")
		.setIcon(android.R.drawable.ic_dialog_info)                
		.setSingleChoiceItems(new String[] {"����������","ָ�����"}, 0, 
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
		.setNegativeButton("ȡ��", null)
		.show();
			break;
		
		/*
		 *  
		 */
		case Menu.FIRST + 2:
			
		new AlertDialog.Builder(this)
		.setTitle("��ѡ��")
		.setIcon(android.R.drawable.ic_dialog_info)                
		.setSingleChoiceItems(new String[] {"������","ָ������"}, 0, 
		  new DialogInterface.OnClickListener() {
		                            
		     public void onClick(DialogInterface dialog, int which) {
		    	 dialog.dismiss();
		    	 if(which == 0){
		    		 
		    	 }else if (which == 1) {
					
				}
		     }
		  }
		)
		.setNegativeButton("ȡ��", null)
		.show();
			break;
		
		case Menu.FIRST + 3:
			
			break;
		
		//���ȡ��������������
		case Menu.FIRST + 4:
			break;
		default:
			break;
		}
		
		
		return false;
	}
	
	/*
	 *  �趨���������ŶԻ���
	 */
	private void showProportionZoomDialpg(){
		final EditText propEditText = new EditText(this);
		
		new AlertDialog.Builder(this)
		.setTitle("���������ű���")
		.setIcon(android.R.drawable.ic_dialog_info)
		.setView(propEditText)
		.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				double zoomData = Double.parseDouble(propEditText.getText().toString());
				
				//�ڴ˽�������
				
			}
		})
		.setNegativeButton("ȡ��", null)
		.show();
		
	}
	
	/*
	 * 	�趨ָ����ȸ߶ȶԻ���
	 */
	private void showFixZoomDialog(){
		pzDialog pz_dialog = new pzDialog(this);
		pz_dialog.setTitle("���������ű���");
		pz_dialog.show();
		
		/*
		 *  �߶ȺͿ��������pzDialog���л�ȡ��������������Ч��
		 */
	}
}