package com.example.yunpicture;

import android.R.integer;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class pzDialog extends Dialog implements android.view.View.OnClickListener{

	/**
	 * @param args
	 */
	Button okButton;  
	Button clButton;
	
	public pzDialog(Context context){
		super(context);
		setContentView(R.layout.proportion_zoom);
		okButton = (Button) findViewById(R.id.pz_OkButton);
		okButton.setOnClickListener(this);
		
		clButton = (Button) findViewById(R.id.pz_clButton);
		clButton.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if (arg0 == clButton) {
			dismiss();
		}
		
		if (arg0 == okButton) {
			dismiss();
			EditText pz_width = (EditText) findViewById(R.id.pz_width);
			EditText pz_height = (EditText) findViewById(R.id.pz_height);
			
			int targetWidth = Integer.parseInt(pz_width.getText().toString());
			int targetHeight = Integer.parseInt(pz_height.getText().toString());
			
			/*
			 * 已经获取到设定的长度和宽度，直接设置图片即可
			 * 注：输入没有检测，非数字程序会崩溃
			 */
			//Todo
			
			
		}
	}
	
}
