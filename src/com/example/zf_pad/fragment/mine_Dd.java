package com.example.zf_pad.fragment;

import com.example.zf_pad.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class mine_Dd extends Fragment {
	private View view;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			//view = inflater.inflate(R.layout.f_mine_myorder, container,false);
		
		if (view != null) {
			
			ViewGroup parent = (ViewGroup) view.getParent();
			if (parent != null)
				 parent.removeView(view);
		}
		
		try {
			view = inflater.inflate(R.layout.f_mine_myorder, container, false);
			
		} catch (InflateException e) {

		}

		return view;
	}
}
