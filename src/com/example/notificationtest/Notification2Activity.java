package com.example.notificationtest;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Notification2Activity extends Activity implements OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.notification2);
    	findViewById(R.id.cancleBtn).setOnClickListener(this);
    	
    	
    	
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		cancelNotification();
	}

	private void cancelNotification() {
		// TODO Auto-generated method stub
		NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
	    notificationManager.cancel(R.drawable.icon);
	    Toast.makeText(this, "Notification canceled", Toast.LENGTH_SHORT).show();
	}
}
