package com.example.zf_pad.popwindow;

import com.example.zf_pad.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.PopupWindow;

public class MyPopWindow extends PopupWindow implements OnClickListener{
	private View conentView;
	private Activity context;
	public MyPopWindow(final Activity context) {
		this.context = context;
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		conentView = inflater.inflate(R.layout.popwin_setting, null);
		int h = context.getWindowManager().getDefaultDisplay().getHeight();
		int w = context.getWindowManager().getDefaultDisplay().getWidth();
		// ����SelectPicPopupWindow��View
		this.setContentView(conentView);
		// ����SelectPicPopupWindow��������Ŀ�
		this.setWidth(LayoutParams.FILL_PARENT);
		// ����SelectPicPopupWindow��������ĸ�
		this.setHeight(LayoutParams.FILL_PARENT);
		// ����SelectPicPopupWindow��������ɵ��
		this.setFocusable(true);
		this.setOutsideTouchable(true);
		// ˢ��״̬
		this.update();
		// ʵ����һ��ColorDrawable��ɫΪ��͸��
		ColorDrawable dw = new ColorDrawable(0000000000);
		// ��back���������ط�ʹ����ʧ,������������ܴ���OnDismisslistener �����������ؼ��仯�Ȳ���
		this.setBackgroundDrawable(dw);
		// mPopupWindow.setAnimationStyle(android.R.style.Animation_Dialog);
		// ����SelectPicPopupWindow�������嶯��Ч��
		// this.setAnimationStyle(R.style.AnimationPreview);
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

}
