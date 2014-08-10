package com.example.singletastktest;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		TextView txt = new TextView(this);
		setContentView(txt);
		txt.setText(getTaskId()+"");
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this,First.class);
		startActivity(intent);
		DisplayMetrics dm = getResources().getDisplayMetrics();
		TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, dm);
		return super.onTouchEvent(event);
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Toast.makeText(this, "ondestory", 1000).show();
		super.onDestroy();
	}
}
