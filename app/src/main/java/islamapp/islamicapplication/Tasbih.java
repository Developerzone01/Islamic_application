package islamapp.islamicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tasbih extends AppCompatActivity {
    TextView display;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

        display= (TextView) findViewById(R.id.display);
        getSupportActionBar().setTitle("Tasbih");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void click(View view) {
        count++;
        display.setText(count+"");
    }

    public void reset(View view) {
        display.setText("0");
        count=0;
    }
}
