package islamapp.islamicapplication;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by Faisal Ijaz on 8/15/2018.
 */

public class NotificationHelper extends ContextWrapper {
    public   String alarmName = "Alarm alert";
    public static final String alarmTitle = "Alarm of nemaz";
    private NotificationManager mManager;

    public NotificationHelper(Context base) {
        super(base);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
        createChannel();}
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void createChannel() {
        NotificationChannel channel = new NotificationChannel(alarmName, alarmTitle , NotificationManager.IMPORTANCE_DEFAULT);

        channel.enableLights(true);
        channel.enableVibration(true);
        channel.setLightColor(R.color.colorPrimary);
        channel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);

        getmManager().createNotificationChannel(channel);
    }
    public NotificationManager getmManager(){
        if (mManager == null){
            mManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }
        return mManager;
    }

    public android.support.v4.app.NotificationCompat.Builder getChannel(String title , String message){
        return new android.support.v4.app.NotificationCompat.Builder(getApplicationContext())
                .setContentTitle(title).setContentText(message).setSmallIcon(R.drawable.ic_alarm);
    }
}
