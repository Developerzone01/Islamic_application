package islamapp.islamicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Recomended_video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomended_video);
        getSupportActionBar().setTitle("Islamic Scholars");


    }

    public void button1(View view) {
        Intent intent=new Intent( Recomended_video.this,Community_one.class);
        startActivity(intent);
        Toast.makeText(Recomended_video.this,"Please wait while loading videos",Toast.LENGTH_LONG).show();

    }

    public void button2(View view) {
        Intent intent=new Intent( Recomended_video.this,Community_two.class);
        startActivity(intent);
        Toast.makeText(Recomended_video.this,"Please wait while loading videos",Toast.LENGTH_LONG).show();


    }

    public void button3(View view) {
        Intent intent=new Intent( Recomended_video.this,Community_three.class);
        startActivity(intent);
        Toast.makeText(Recomended_video.this,"Please wait while loading videos",Toast.LENGTH_LONG).show();


    }

    public void button4(View view) {
        Intent intent=new Intent( Recomended_video.this,Community_four.class);
        startActivity(intent);
        Toast.makeText(Recomended_video.this,"Please wait while loading videos",Toast.LENGTH_LONG).show();


    }
}
