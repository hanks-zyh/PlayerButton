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
	private PlayerButton pb1;
	private PlayerButton pb2;

	private void init() {
//		final MediaPlayer player = new MediaPlayer();
//		player.reset();
//		try {
//			player.setDataSource("");
//
//			player.prepareAsync();
//
//			player.setOnPreparedListener(new OnPreparedListener() {
//				@Override
//				public void onPrepared(MediaPlayer mp) {
//					player.start();
//				}
//			});
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		pb = (PlayerButton) findViewById(R.id.pb);
		pb1 = (PlayerButton) findViewById(R.id.pb1);
		pb2 = (PlayerButton) findViewById(R.id.pb2);
		
		pb.setMax(10000);
		pb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				pb.play();
			}
		});
		pb1.setMax(4000);
		pb1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				pb1.play();
			}
		});
		pb2.setMax(7000);
		pb2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				pb2.play();
			}
		});
	}

}
