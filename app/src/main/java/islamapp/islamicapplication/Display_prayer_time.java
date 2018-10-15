package islamapp.islamicapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.*;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Display_prayer_time extends AppCompatActivity {

    private TextView times;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_prayer_time);


        getSupportActionBar().setTitle("Get Prayer Time");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        times = (TextView) findViewById(R.id.times);

        savedInstanceState = getIntent().getExtras();

        double latitude = savedInstanceState.getDouble("lat");
        double longitude = savedInstanceState.getDouble("lng");

        Log.i("DisplayPrayerTimes", latitude + " : " + longitude);

        displayTime(latitude, longitude);
    }

    private void displayTime(double lat, double lng) {

        times.setText("");

        double timezone = (Calendar.getInstance().getTimeZone()
                .getOffset(Calendar.getInstance().getTimeInMillis()))
                / (1000 * 60 * 60);
        PrayerTime prayers = new PrayerTime();

        prayers.setTimeFormat(prayers.Time12);
        prayers.setCalcMethod(prayers.Makkah);
        prayers.setAsrJuristic(prayers.Shafii);
        prayers.setAdjustHighLats(prayers.AngleBased);

        int[] offsets = { 0, 0, 0, 0, 0, 0, 0 }; // {Fajr,Sunrise,Dhuhr,Asr,Sunset,Maghrib,Isha}
        prayers.tune(offsets);

        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);

        ArrayList prayerTimes = prayers.getPrayerTimes(cal, lat,
                lng, timezone);
        ArrayList prayerNames = prayers.getTimeNames();

        for (int i = 0; i < prayerTimes.size(); i++) {
            times.append("\n" + prayerNames.get(i) + " - "
                    + prayerTimes.get(i));
        }
    }


    // Ser Alarm Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_set_alarm) {
            startActivity(new Intent(getApplicationContext(), AlarmAct.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
