package islamapp.islamicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.DateTimeKeyListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Years;
import org.joda.time.chrono.IslamicChronology;

public class Age_Calculation extends AppCompatActivity {

    private Button calculate;
    private TextView islamicAgeView;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.age_calculation);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Calculate Age");


        calculate = (Button) findViewById(R.id.calc);
        islamicAgeView = (TextView) findViewById(R.id.ageView);
        datePicker = (DatePicker) findViewById(R.id.datePicker);

        final DateTime now = new DateTime(datePicker.getYear(), datePicker.getMonth() + 1,
                datePicker.getDayOfMonth(), 0, 0, 0);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                calculateAge(now);
            }
        });
        String islamicAge = null;

    }

    private void calculateAge(DateTime now) {


        DateTime then = new DateTime(datePicker.getYear(), datePicker.getMonth() + 1,
                datePicker.getDayOfMonth(), 0, 0, 0);

        if(now.getYear() == then.getYear()&& now.getMonthOfYear()==then.getMonthOfYear()&& now.getDayOfMonth()==then.getDayOfMonth()) {

            Toast.makeText(this, "Please choose your date of birth", Toast.LENGTH_LONG).show();
            return;
        }

        DateTime islamicThen = then.withChronology(IslamicChronology.getInstance(DateTimeZone.UTC));
        DateTime islamicNow = now.withChronology(IslamicChronology.getInstance(DateTimeZone.UTC));

        int years = Years.yearsBetween(islamicThen, islamicNow).getYears();
        int months = Math.abs(islamicNow.getMonthOfYear() - islamicThen.getMonthOfYear());
        int days = Math.abs(islamicNow.getDayOfMonth() - islamicThen.getDayOfMonth());

        islamicAgeView.setText(" Your age is:            " + years +" Hijri Years ," + months + " Months ," +
                days + "Days.");

        return;
    }
    public boolean onOptionitemSelected(MenuItem item) {
        int id = item.getItemId();

        {

          this.finish();

        }
        return super.onOptionsItemSelected(item);
    }
    }

