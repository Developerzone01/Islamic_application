package islamapp.islamicapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;

public class Alarm  extends BroadcastReceiver {

    String name = "Alarm";
    String title = "Prayer Time";
    MediaPlayer mediaPlayer;
    //the method will be fired when the alarm is triggerred
    @Override
    public void onReceive(Context context, Intent intent) {
        mediaPlayer = MediaPlayer.create(context,
                Settings.System.DEFAULT_RINGTONE_URI);

        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = notificationHelper.getChannel(name,title);
        notificationHelper.getmManager().notify(1, nb.build());


        mediaPlayer.start();

        //Add this code in Alarm.java Class for ringing only 20 seconds after that ringing will be stoped
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mediaPlayer.stop();
            }
        }, 20000);
        //// till here


    }

}
