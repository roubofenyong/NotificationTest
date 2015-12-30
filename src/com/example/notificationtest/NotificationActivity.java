package com.example.notificationtest;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class NotificationActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification);
		findViewById(R.id.notificationBtn).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		addNotification();
	}

	@SuppressWarnings("deprecation")
	private void addNotification() {
		// TODO Auto-generated method stub
		NotificationManager manager = (NotificationManager)this.getSystemService(Context.NOTIFICATION_SERVICE);
		Notification notification = new Notification();
		notification.audioStreamType = android.media.AudioManager.ADJUST_LOWER;
		Intent intent = new Intent(this,Notification2Activity.class);
		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);	
	    notification = new Notification.Builder(this)
									.setTicker("我在这里")
									.setSmallIcon(R.drawable.icon)
									.setDefaults(Notification.DEFAULT_SOUND)
									.setContentIntent(pendingIntent)
									.setContentTitle("短信通知")
									.setContentText("好好学习,天天向上")
									.build();
	    manager.notify(R.drawable.icon,notification);
	}

}
