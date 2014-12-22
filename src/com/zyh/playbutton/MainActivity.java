package com.zyh.playbutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	private PlayerButton pb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	int progress = 0;

	private void init() {
		pb = (PlayerButton) findViewById(R.id.pb);
		pb.setState(PlayerButton.STATE_CAN_PLAY);
		pb.setMax(10000);
		pb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				pb.play(MainActivity.this);
			}
		});
	}

}
