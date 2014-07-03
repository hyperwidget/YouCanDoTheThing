package com.android.calmlycoding.youcandothething;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class WearMain extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        notifyTest();
    }

    public void notifyTest(){
        int notificationId = 001;
// Build intent for notification content
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);

        PendingIntent mapPendingIntent =
                PendingIntent.getActivity(this, 0, mapIntent, 0);

        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentTitle("Feeling Unmotivated?")
                        .setContentText("I Gots what ails ya")
                        .addAction(R.drawable.ic_launcher,
                                "Hit me!", mapPendingIntent);

// Get an instance of the NotificationManager service
        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(this);

// Build the notification and issues it with notification manager.
        notificationManager.notify(notificationId, notificationBuilder.build());

        finish();
    }
}
