package islamapp.islamicapplication;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class AlarmAct extends AppCompatActivity {
    TimePicker timePicker;
    AlarmManager am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        timePicker = (TimePicker) findViewById(R.id.timePicker);

        //attaching clicklistener on button
        findViewById(R.id.buttonAlarm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //We need a calendar object to get the specified time in millis
                //as the alarm manager method takes time in millis to setup the alarm
                Calendar calendar = Calendar.getInstance();
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                            calendar.get(Calendar.DAY_OF_MONTH),
                            timePicker.getHour(), timePicker.getMinute(), 0);
                } else {
                    calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                            calendar.get(Calendar.DAY_OF_MONTH),
                            timePicker.getCurrentHour(), timePicker.getCurrentMinute(), 0);
                }
                setAlarm(calendar.getTimeInMillis());
            }
        });
    }
    private void setAlarm(long time) {
        //getting the alarm manager
        am = (AlarmManager) getSystemService(this.ALARM_SERVICE);

        //creating a new intent specifying the broadcast receiver
        Intent i = new Intent(getApplicationContext(), Alarm.class);

        //creating a pending intent using the intent
        PendingIntent pi = PendingIntent.getBroadcast(this, 0, i, 0);

        //setting the repeating alarm that will be fired every day
        am.setRepeating(AlarmManager.RTC, time, AlarmManager.INTERVAL_DAY, pi);


        Toast.makeText(this, "Alarm is set", Toast.LENGTH_SHORT).show();


    }

    }

